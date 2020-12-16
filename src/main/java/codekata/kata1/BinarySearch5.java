package codekata.kata1;

import org.apache.log4j.Logger;

/**
 * In this kata we have to write binary serach in 5 ways.
 * This is the fifth way for binary search using infinite length
 * ascending array.
 */
public class BinarySearch5 {
    private static final Logger LOGGER = Logger.getLogger(BinarySearch5.class.getName());

    public int get(int index, int arr[]){
        if(index >= arr.length)
            return Integer.MAX_VALUE;
        return arr[index];
    }

    public int binarySearchImplementation(int element, int arr[], int low, int high){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(element < this.get(mid, arr))
                high = mid - 1;
            else if(element > this.get(mid, arr))
                low = mid + 1;
            else
                return mid;
        }
        return BinarySearchConstants.NOT_PRESENT;
    }

    /**
     * This function will take infinite length array as input
     * and found the bound by doubling the size of high each time.
     * initially, i am assuming lowest possible bound for high(which is 1)
     * @param element
     * @param arr
     * @return
     */
    public int binarySearch(int element, int arr[]){
        LOGGER.info("Inside BinarySearch5:binarySearch");
        int low = 0, high = 1;

        while(this.get(high, arr)< element){
            int newStart = high+1;
            high+=(high-low+1)*2;
            low = newStart;
        }

        return binarySearchImplementation(element, arr, low, high);
    }
}
