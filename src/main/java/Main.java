import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        SftpGroupXFile entity1 = new SftpGroupXFile(
                63,
                1241,
                1086,
                "Operation",
                1048,
                "MTH_LOD[A-Z]{2}_[0-9]{4}_points_award_report_.*\\\\.csv");
        SftpGroupXFile entity2 = new SftpGroupXFile(
                63,
                1241,
                1086,
                "Operation",
                1068,
                "MTL_[A-Z]{2}_(Awarded|Redeemed)_points_.*_(Fuel|CR)_[0-9]{6}.xls");
        SftpGroupXFile entity3 = new SftpGroupXFile(
                63,
                1241,
                1086,
                "Financial",
                -1106,
                "cicacica");
        SftpGroupXFile entity4 = new SftpGroupXFile(
                63,
                1241,
                1086,
                "Financial",
                -1106,
                "kutyakutya");

        Set<SftpGroupXFile> sftpGroupXFileSet = new HashSet<>();
        sftpGroupXFileSet.add(entity1);
        sftpGroupXFileSet.add(entity2);
        sftpGroupXFileSet.add(entity3);
        sftpGroupXFileSet.add(entity4);

        Set<SftpGroupXFileMasks> result;

        result = sftpGroupXFileSet.stream()
                .collect(Collectors.groupingBy(SftpGroupXFile::getGroupName,
                        Collectors.mapping(SftpGroupXFile::getFileMask, Collectors.toList())))
                .entrySet().stream()
                .map(e -> new SftpGroupXFileMasks(e.getKey(), e.getValue()))
                .collect(Collectors.toSet());

        printResult(result);
    }

    private static void printResult(Set<SftpGroupXFileMasks> groupXFileMasks) {
        groupXFileMasks.forEach(e -> {
            System.out.println(e.getGroupName() + ":");
            for (String fileMask : e.getFileMasks()) {
                System.out.println("    " + fileMask);
            }
        });
    }
}
