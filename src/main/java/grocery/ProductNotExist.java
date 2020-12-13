package grocery;


/**
 * Custom exception
 *
 */
public class ProductNotExist extends Exception {

    public ProductNotExist(){}

    public ProductNotExist(String message){
        super(message);
    }

    public ProductNotExist(String message, Throwable cause){
        super(message, cause);
    }

    @Override
    public String getMessage() {
        return "Grocery: "+super.getMessage();
    }
}
