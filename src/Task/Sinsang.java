package Task;


public class Sinsang {
    private String Department;
    private String Student_Number;
    private String Student_Name;

    public Sinsang() {}

    public Sinsang(String department, String number, String name) {
        Department = department;
        Student_Number = number;
        Student_Name = name;
    }

    public String GetDepartment() {
        return this.Department;
    }

    public String GetStudentNumber() {
        return this.Student_Number;
    }

    public String GetStudentName() {
        return this.Student_Name;
    }

}
