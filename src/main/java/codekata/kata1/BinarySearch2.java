package codekata.kata1;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * In this kata we have to write binary serach in 5 ways.
 * This is the second way for binary search.
 * in this i am using 2-d array
 */
public class BinarySearch2 {

    private static final Logger LOGGER = Logger.getLogger(BinarySearch2.class.getName());
    /**
     * Binary search
     * @param element
     * @param arr
     * @param low
     * @param high
     * @param row
     * @return row and column of element if element is present
     * otherwise (-1,-1)
     */
    public static List<Integer> binarySearchImplementation(int element, int arr[][], int low, int high, int row){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(element < arr[row][mid])
                high = mid - 1;
            else if(element > arr[row][mid])
                low = mid + 1;
            else
                return Arrays.asList(row, mid);
        }
        return Arrays.asList(-1, -1);
    }

    /**
     * @param matrix
     * @param element
     * @return index(row and column) of element
     */
    public static List<Integer> binarySearch(int[][] matrix, int element){
        LOGGER.info("Inside BinarySearch2:binarySearch");

        if(matrix.length == 0||matrix[0].length==0)
            return Arrays.asList(-1, -1);
        if(matrix.length == 1){
            return binarySearchImplementation(element, matrix, 0, matrix[0].length - 1, 0);
        }
        int low = 0;
        int high = matrix.length - 1;
        int columnMid = matrix[0].length/2;
        while ((low+1) < high){
            int rowMid = (low + high)/2;
            if(matrix[rowMid][columnMid] == element){
                return Arrays.asList(rowMid, columnMid);
            }
            else if(matrix[rowMid][columnMid] < element)
                low = rowMid;
            else
                high = rowMid;
        }
        if(matrix[low][columnMid] == element)
            return Arrays.asList(low, columnMid);
        else if(matrix[low+1][columnMid] == element)
            return Arrays.asList(low+1, columnMid);
        else if(element <= matrix[low][columnMid-1])
            return binarySearchImplementation(element,matrix,0, columnMid-1, low);
        else if(element >= matrix[low][columnMid+1]&& element<= matrix[low][matrix[low].length-1])
            return binarySearchImplementation(element, matrix, columnMid+1, matrix[low].length-1, low);
        else if(element <= matrix[low+1][columnMid-1])
            return binarySearchImplementation(element,matrix,0, columnMid-1, low+1);
        else
            return binarySearchImplementation(element, matrix, columnMid+1, matrix[low].length-1, low+1);


    }

}
