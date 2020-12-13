package data_manipulation.immutabilty;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Money.class)
public class MoneyTest {
    private Currency currency;
    private Money money;

    @Before
    public void setUp(){
        money = new Money(2.0,  new Currency("INR"));
    }

    @Test
    public void getCurrencyTest(){
        Assert.assertEquals("INR", money.getCurrency().getValue());
    }

    @Test
    public void getAmountTest(){
        Assert.assertEquals(2.0, money.getAmount(), 1);
    }

}