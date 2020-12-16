package codekata.kata1;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * In this kata we have to write binary serach in 5 ways.
 * This is the fourth way for binary search.
 * In this, Array is finite, sorted in ascending order, and can have duplicates.
 */
public class BinarySearch4 {
    private static final Logger LOGGER = Logger.getLogger(BinarySearch4.class.getName());
    /**
     *
     * @param element
     * @param arr
     * @return true if element is found, otherwise false
     */
    public static boolean binarySearch(int element, int arr[]){
        LOGGER.info("Inside BinarySearch4:binarySearch");
        int low = 0, high = arr.length - 1;
        if(BinarySearch1.binarySearch(element, arr)!= BinarySearchConstants.NOT_PRESENT)
            return BinarySearchConstants.TRUE;
        else
            return BinarySearchConstants.FALSE;

    }
}
