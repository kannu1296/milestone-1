package set.hashset;

import java.util.HashSet;

public class StudentTest {

        /**
         * Store data in Student class on the basis of roll number.
         * one student should have one roll number.
         * If we try to store more than one entry using same roll number, then it should not be store.
         */
        private HashSet<Student> studentHashSet = new HashSet<>();

    /**
     * this will store
     * @param student
     * in set
     */
    public int saveStudent(Student student) throws StudentAlreadyExistCustomException{
        boolean val = studentHashSet.add(student);
        if(!val)
            throw new StudentAlreadyExistCustomException("Roll number is already exist");
        return studentHashSet.size();
    }
}
