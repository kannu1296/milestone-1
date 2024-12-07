package set.hashset;

public class StudentAlreadyExistException extends RuntimeException {

    public StudentAlreadyExistException(String message){
        super(message);
    }

    public StudentAlreadyExistException(String message, Throwable cause){
        super(message, cause);
    }
}
