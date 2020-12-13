package inheritance;

/**
 * Program to demonstarte single level inheritance
 */
public class Student extends Person {
    private int marks;
    private String tutorials;

    public Student(){}

    public Student(int marks, String tutorials){
        this.marks = marks;
        this.tutorials = tutorials;
    }

    public Student(String name, int age, String city, int marks, String tutorials) {
        super(name, age, city);
        this.marks = marks;
        this.tutorials = tutorials;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getTutorials() {
        return tutorials;
    }

    public void setTutorials(String tutorials) {
        this.tutorials = tutorials;
    }
}
