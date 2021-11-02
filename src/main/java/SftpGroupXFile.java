public class SftpGroupXFile {

    Integer countryId;
    Integer rightId;
    Integer sftpGroupId;
    String groupName;
    Integer fileMaskId;

    public SftpGroupXFile(Integer countryId, Integer rightId, Integer sftpGroupId, String groupName, Integer fileMaskId, String fileMask) {
        this.countryId = countryId;
        this.rightId = rightId;
        this.sftpGroupId = sftpGroupId;
        this.groupName = groupName;
        this.fileMaskId = fileMaskId;
        this.fileMask = fileMask;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    public Integer getSftpGroupId() {
        return sftpGroupId;
    }

    public void setSftpGroupId(Integer sftpGroupId) {
        this.sftpGroupId = sftpGroupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getFileMaskId() {
        return fileMaskId;
    }

    public void setFileMaskId(Integer fileMaskId) {
        this.fileMaskId = fileMaskId;
    }

    public String getFileMask() {
        return fileMask;
    }

    public void setFileMask(String fileMask) {
        this.fileMask = fileMask;
    }

    String fileMask;


}
