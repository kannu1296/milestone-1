package set.treeset;

import java.util.ArrayList;

public class TreeSetTest {
    public static void main(String[] args) {
        UserRequest userRequest1 = new UserRequest(4, "Problem1");
        UserRequest userRequest2 = new UserRequest(2, "Problem2");
        UserRequest userRequest3 = new UserRequest(5, "Problem3");
        UserRequest userRequest4 = new UserRequest(4, "Problem1");

        ArrayList<UserRequest> userRequestArrayList = new ArrayList<>();
        userRequestArrayList.add(userRequest1);
        userRequestArrayList.add(userRequest2);
        userRequestArrayList.add(userRequest3);
        userRequestArrayList.add(userRequest4);

        TreeSetExample treeSetExample = new TreeSetExample();
        treeSetExample.saveRequest(userRequestArrayList);
        treeSetExample.viewRequest();
    }
}
