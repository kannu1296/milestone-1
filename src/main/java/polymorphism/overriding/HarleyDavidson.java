package polymorphism.overriding;

/**
 * program to show final and static method example
 */
public class HarleyDavidson extends Bike {

    public static String getBrandName(){
        return BikeConstants.BRAND_NAME;
    }

    public final void services(){
        /**
         * Services like, warranty period, number of free bike services,
         * terms&conditions, etc
         */

    }
}
