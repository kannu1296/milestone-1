package inheritance;

/**
 * Program to demonstrate hierarchical inheritance example
 */
public class Teacher extends Person {
    private String designation;
    private String department;

    public Teacher(String designation, String department) {
        this.designation = designation;
        this.department = department;
    }

    public Teacher(String name, int age, String city, String designation, String department) {
        super(name, age, city);
        this.designation = designation;
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
