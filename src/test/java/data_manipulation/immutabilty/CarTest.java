package data_manipulation.immutabilty;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Car.class)
public class CarTest {

    private Car car;

    @Before
    public void setUp(){
        car = new Car("BMW", "X1");
    }

    @Test
    public void getBrand() {
        Assert.assertEquals("BMW", car.getBrand());
    }

    @Test
    public void getModel() {
        Assert.assertEquals("X1", car.getModel());
    }

    @Test
    public void withModel() {
        Car newModelCar = car.withModel("X2");
        Assert.assertEquals("X2", newModelCar.getModel());
    }
}