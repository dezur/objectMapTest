import java.util.List;

public class SftpGroupXFileMasks {

    String groupName;
    List<String> fileMasks;

    public SftpGroupXFileMasks(String groupName, List<String> fileMasks) {
        this.groupName = groupName;
        this.fileMasks = fileMasks;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<String> getFileMasks() {
        return fileMasks;
    }

    public void setFileMasks(List<String> fileMasks) {
        this.fileMasks = fileMasks;
    }
}
