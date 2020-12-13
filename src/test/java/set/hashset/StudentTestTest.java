package set.hashset;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTestTest {
    private StudentTest studentTest;


    @Before
    public void setUp() throws Exception {
        studentTest = new StudentTest();
    }

    @Test
    public void saveStudent() {
        int valReturn = studentTest.saveStudent(new Student(1, "karan", "CSE"));
        Assert.assertEquals(1, valReturn);
    }

    @Test(expected = StudentAlreadyExistCustomException.class)
    public void saveDuplicateStudent(){
        studentTest.saveStudent(new Student(1, "karan", "CSE"));
        studentTest.saveStudent(new Student(1, "karan", "CSE"));
    }
}