package polymorphism.overloading;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {
    private Addition addition;

    @Before
    public void setUp() throws Exception {
        addition = new Addition();
    }

    @Test
    public void add() {
        int addResult = addition.add(2, 3);
        Assert.assertEquals(5, addResult);
    }

    @Test
    public void add1() {
        int addResult  = addition.add(1,2, 3);
        Assert.assertEquals(6, addResult);
    }

}