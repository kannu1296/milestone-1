package set.hashset;

public class StudentAlreadyExistCustomException extends RuntimeException {

    public StudentAlreadyExistCustomException(String message){
        super(message);
    }

    public StudentAlreadyExistCustomException(String message, Throwable cause){
        super(message, cause);
    }
}
