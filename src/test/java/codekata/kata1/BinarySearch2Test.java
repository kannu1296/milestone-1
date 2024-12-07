package codekata.kata1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch2Test {
    /**
     * Searching for an element in the empty matrix
     */
    @Test
    public void binarySearch1(){
        int[][] matrix = new int[][]{{}};
        Object[] actualArray = BinarySearch2.binarySearch(matrix,13).toArray();
        Object[] expectedArray = Arrays.asList(-1, -1).toArray();
        Assert.assertArrayEquals(expectedArray, actualArray);
    }
    /**
     * Searching for an element not present in the matrix
     * when column size is odd
     */
    @Test
    public void binarySearch2(){
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        Object[] actualArrayList = BinarySearch2.binarySearch(matrix,10).toArray();
        Object[] expectedArrayList = Arrays.asList(-1, -1).toArray();
        Assert.assertArrayEquals(expectedArrayList, actualArrayList);
    }

    /**
     * Searching for an element not present in the matrix
     * when column size is even
     */
    @Test
    public void binarySearch3(){
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        Object[] actualArray = BinarySearch2.binarySearch(matrix,13).toArray();
        Object[] expectedArray = Arrays.asList(-1, -1).toArray();
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    /**
     * Searching for an element when row size is 1
     */
    @Test
    public void binarySearch4(){
        int[][] matrix = new int[][]{{1,2,3,4}};
        Object[] actualArray = BinarySearch2.binarySearch(matrix,2).toArray();
        Object[] expectedArray = Arrays.asList(0, 1).toArray();
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    /**
     * Searching for an element when row & col size is 1
     */
    @Test
    public void binarySearch5(){
        int[][] matrix = new int[][]{{1}};
        Object[] actualArray = BinarySearch2.binarySearch(matrix,1).toArray();
        Object[] expectedArray = Arrays.asList(0, 0).toArray();
        Assert.assertArrayEquals(expectedArray, actualArray);
    }
    @Test
    public void binarySearch6(){
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8}};
        Object[] actualArray = BinarySearch2.binarySearch(matrix,5).toArray();
        Object[] expectedArray = Arrays.asList(1, 0).toArray();
        Assert.assertArrayEquals(expectedArray, actualArray);
    }


}