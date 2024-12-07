package inheritance;

/**
 * Program to demonstrate multilevel inheritance example
 */
public class EngineeringStudent extends Student {
    private String branch;

    public EngineeringStudent(String branch) {
        this.branch = branch;
    }

    public EngineeringStudent(int marks, String tutorials, String branch) {
        super(marks, tutorials);
        this.branch = branch;
    }

    public EngineeringStudent(String name, int age, String city, int marks, String tutorials, String branch) {
        super(name, age, city, marks, tutorials);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
