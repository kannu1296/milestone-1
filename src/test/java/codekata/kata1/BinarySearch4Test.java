package codekata.kata1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(BinarySearch4.class)
public class BinarySearch4Test {

    /**
     * Searching for duplicate element
     */
    @Test
    public void binarySearch1(){
        boolean found = BinarySearch4.binarySearch(2,new int[]{1,2,2,3});
        Assert.assertTrue(found);
    }

    /**
     * Searching for non present element
     */
    @Test
    public void binarySearch2(){
        boolean found = BinarySearch4.binarySearch(4,new int[]{1,2,2,3});
        Assert.assertFalse(found);
    }

    /**
     * Searching for an element in empty array
     */
    @Test
    public void binarySearch3(){
        boolean found = BinarySearch4.binarySearch(4,new int[]{});
        Assert.assertFalse(found);
    }
}