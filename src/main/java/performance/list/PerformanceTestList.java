package performance.list;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This will show the random access and deletion performance test
 */
public class PerformanceTestList {
    private ArrayList<Integer> arrayList = new ArrayList<>();
    private LinkedList<Integer> linkedList = new LinkedList<>();

    private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceTestList.class);

    //Insert elements into ArrayList and LinkedList.
    public void addIntoLists(){
        for(int i = 0; i<100000; i++){
            arrayList.add(i);
            linkedList.add(i);
        }
    }

    /**
     * Random accessing performance analysis on ArrayList and LinkedList
     */
    public void accessFromLists(){
        long time = System.currentTimeMillis();
        for(int i = 0; i<100000; i++){
            arrayList.get(10000);
        }
        time = System.currentTimeMillis() - time;
        LOGGER.info("Access Time taken by ArrayList {}ms", time);

        time = System.currentTimeMillis();
        for(int i = 0; i<100000; i++){
            linkedList.get(10000);
        }
        time = System.currentTimeMillis() - time;
        LOGGER.info("Access Time taken by LinkedList {}ms", time);
    }

    /**
     * Deletion performance analysis on ArrayList and LinkedList
     */
    public void deleteFromLists(){
        long time = System.currentTimeMillis();
        for(int i = 0; i<100000; i++){
            linkedList.remove(0);
        }
        time = System.currentTimeMillis() - time;
        LOGGER.info("Delete Time taken by LinkedList {}ms", time);

        time = System.currentTimeMillis();
        for(int i = 0; i<100000; i++){
            arrayList.remove(0);
        }
        time = System.currentTimeMillis() - time;
        LOGGER.info("Delete Time taken by ArrayList {}ms", time);
    }

    public static void main(String[] args) {
        PerformanceTestList performanceTestList = new PerformanceTestList();
        performanceTestList.addIntoLists();
        performanceTestList.accessFromLists();
        performanceTestList.deleteFromLists();
    }
}
