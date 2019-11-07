package mapperDto;

class EmployeeDto {
    private String fullName;
    private Integer experinceYear;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getExperinceYear() {
        return experinceYear;
    }

    public void setExperinceYear(Integer experinceYear) {
        this.experinceYear = experinceYear;
    }
}