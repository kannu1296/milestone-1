package codekata.kata1;

import org.apache.log4j.Logger;

/**
 * In this kata we have to write binary serach in 5 ways.
 * This is the first way for binary search using iterative approach
 * in this array is finite & sorted in ascending order
 *
 */

public class BinarySearch1 {
    private static final Logger LOGGER = Logger.getLogger(BinarySearch1.class.getName());

    public static int binarySearch(int element, int arr[]){
        LOGGER.info("Inside BinarySearch1:binarySearch");
        int low = 0,  high = arr.length -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(element < arr[mid])
                high = mid - 1;
            else if(element > arr[mid])
                low = mid + 1;
            else
                return mid;
        }
        return BinarySearchConstants.NOT_PRESENT;
    }
}
