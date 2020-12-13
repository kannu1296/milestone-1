package set.hashset;

public class Student {
    private int rollNumber;
    private String name;
    private String department;

    public Student(int rollNumber, String name, String department) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.department = department;
    }

    @Override
    public int hashCode() {
        return rollNumber;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student)obj;
        return this.rollNumber == student.rollNumber;
    }

   @Override
    public String toString() {
        return rollNumber+","+name+","+department;
    }
}
