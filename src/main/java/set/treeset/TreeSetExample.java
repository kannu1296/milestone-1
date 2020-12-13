package set.treeset;

import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {
    /**
     * Consider a scenario where we have a collection of requests
     * Where, each use may raise a request many times.
     * Also, we want to serve the oldest user first and youngest in the last.
     */
    private TreeSet<UserRequest> treeSet = new java.util.TreeSet<>();

    public void saveRequest(List<UserRequest> userRequest){
        for(UserRequest request : userRequest)
            treeSet.add(request);
    }

    public void viewRequest(){
        for(UserRequest request:treeSet)
            System.out.println(request.toString());
    }

}
