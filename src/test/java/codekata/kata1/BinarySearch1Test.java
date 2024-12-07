package codekata.kata1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(BinarySearch1.class)
public class BinarySearch1Test {

    /**
     * Searching for middle element in odd length array
     */
    @Test
    public void binarySearchOddArray1() {
        int index = BinarySearch1.binarySearch(2, new int[]{1, 2, 3});
        Assert.assertEquals(1, index);
    }
    /**
     * Searching for first element in odd length array
     */
    @Test
    public void binarySearchOddArray2() {
        int index = BinarySearch1.binarySearch(1, new int[]{1, 2, 3});
        Assert.assertEquals(0, index);
    }
    /**
     * Searching for last element in odd length array
     */
    @Test
    public void binarySearchOddArray3() {
        int index = BinarySearch1.binarySearch(3, new int[]{1, 2, 3});
        Assert.assertEquals(2, index);
    }
    /**
     * Searching for non presesnt element in odd length array
     */
    @Test
    public void binarySearchOddArray4() {
        int index = BinarySearch1.binarySearch(4, new int[]{1, 2, 3});
        Assert.assertEquals(-1, index);
    }

    /**
     * Searching for middle element in even length array
     */
    @Test
    public void binarySearchEvenArray1() {
        int index = BinarySearch1.binarySearch(2, new int[]{1, 2, 3, 4});
        Assert.assertEquals(1, index);
    }

    /**
     * Searching for first element in even length array
     */
    @Test
    public void binarySearchEvenArray2() {
        int index = BinarySearch1.binarySearch(1, new int[]{1, 2, 3, 4});
        Assert.assertEquals(0, index);
    }

    /**
     * Searching for last element in even length array
     */
    @Test
    public void binarySearchEvenArray3() {
        int index = BinarySearch1.binarySearch(4, new int[]{1, 2, 3, 4});
        Assert.assertEquals(3, index);
    }

    /**
     * Searching for non present element in even length array
     */
    @Test
    public void binarySearchEvenArray4() {
        int index = BinarySearch1.binarySearch(10, new int[]{1, 2, 3, 4});
        Assert.assertEquals(-1, index);
    }

    /**
     * Searching for element in empty array
     */
    @Test
    public void binarySearchEmptyArray() {
        int index = BinarySearch1.binarySearch(10, new int[]{});
        Assert.assertEquals(-1, index);
    }

}