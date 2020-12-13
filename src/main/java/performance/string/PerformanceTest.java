package performance.string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Will represent the performance test between string, string Builder, and string Buffer.
 */
public class PerformanceTest {
    private String stringTest = "Test";
    private StringBuilder stringBuilderTest = new StringBuilder("Test");
    private StringBuffer stringBufferTest = new StringBuffer("Test");

    private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceTest.class);

    public void stringPerformanceTest(){
        long time = System.currentTimeMillis();
        for(int i=0; i<1000000; i++)
            stringTest.concat("Test");
        time = System.currentTimeMillis() - time;
        LOGGER.info("Time taken by stringPerformanceTest {} ",time);
    }

    public void stringBuilderPerformanceTest(){
        long time = System.currentTimeMillis();
        for(int i=0; i<1000000; i++)
            stringBuilderTest.append("Test");
        time = System.currentTimeMillis() - time;
        LOGGER.info("Time taken by stringBuilderPerformanceTest {} ",time);
    }

    public void stringBufferPerformanceTest(){
        long time = System.currentTimeMillis();
        for(int i=0; i<1000000; i++)
            stringBufferTest.append("Test");
        time = System.currentTimeMillis() - time;
        LOGGER.info("Time taken by stringBufferPerformanceTest {} ",time);
    }

    public static void main(String[] args) {
        PerformanceTest performanceTest = new PerformanceTest();
        performanceTest.stringBuilderPerformanceTest();
        performanceTest.stringBufferPerformanceTest();
        performanceTest.stringPerformanceTest();
    }
}
