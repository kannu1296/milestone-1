package lfucache;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;



@RunWith(PowerMockRunner.class)
@PrepareForTest(LfuCache.class)
public class LfuCacheTest {
    private LfuCache lfuCache;

    @Before
    public void setUp() throws Exception {
        lfuCache = new LfuCache(3);
    }

    /**
     * When cache is not full
     */
    @Test
    public void set1() {
        lfuCache.set(1, 2);
        lfuCache.set(3,4);
        Object val = lfuCache.get(1);
        Assert.assertEquals(2, val);
    }

    /**
     * When cache is full, but
     * all the elements are accessed same times
     * then it must follow FIFO
     */
    @Test
    public void set2() {
        lfuCache.set(1, 10);
        lfuCache.set(2,20);
        lfuCache.set(3, 30);
        lfuCache.set(4, 40);
        Assert.assertNull(lfuCache.get(1));
    }

    /**
     * When cache is full, and
     * one element accessed multiple times
     * then if we try to insert, it should removes
     * least frequently used element
     */
    @Test
    public void set3() {
        lfuCache.set(1, 10);
        lfuCache.set(2,20);
        lfuCache.set(3, 30);
        lfuCache.set(1, 40);
        lfuCache.set(4, 50);
        Assert.assertNull(lfuCache.get(2));
    }

    /**
     * When cache is full, and
     * multiple element accessed multiple times
     * then if we try to insert, it should removes
     * least frequently used element
     */
    @Test
    public void set4() {
        lfuCache.set(1, 10);
        lfuCache.set(2,20);
        lfuCache.set(2, 20);
        lfuCache.set(3, 30);
        lfuCache.set(3, 30);
        lfuCache.set(4, 30);
        lfuCache.set(4, 30);

        Assert.assertNull(lfuCache.get(1));
    }

    /**
     * When cache is null then it should
     * retutn null
     */
    @Test
    public void cacheNullTest(){
        Assert.assertNull(lfuCache.get(1));
    }
}