package data_types.primitive_wrapper;

public class PrimitiveAndWrapper {
     private Integer integerVariable = 10; //Unboxing Examole
     private Float floatVariable = 10.0F;
     private Long longVariable = 10L;
     private Double doubleVariable = 10.0;

     private int integerVariable1 = integerVariable;    //Autoboxing examople
     private float floatVariable1 = floatVariable;
     private long longVariable1 = longVariable;
     private double doubleVariable1 = doubleVariable;

    public void nullAssign(){
        integerVariable = null;
        integerVariable1 = integerVariable;
    }

    public void print(){
        System.out.println(this.integerVariable);
        System.out.println(this.integerVariable1);
        System.out.println(this.floatVariable);
        System.out.println(this.floatVariable1);
        System.out.println(this.longVariable);
        System.out.println(this.longVariable1);
        System.out.println(this.doubleVariable);
        System.out.println(this.doubleVariable1);
    }
}
