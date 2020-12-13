package set.treeset;

public class UserRequest implements Comparable<UserRequest> {
    private int requestNumber;
    private String requestContent;

    public UserRequest(int requestNumber, String requestContent){
        this.requestNumber = requestNumber;
        this.requestContent = requestContent;
    }

    public void setRequestNumber(int requestNumber) {
        this.requestNumber = requestNumber;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    @Override
    public int compareTo(UserRequest comparableObject) {
        return this.requestNumber - comparableObject.requestNumber;
    }

    @Override
    public String toString() {
        return requestNumber +"->"+ requestContent;
    }
}
