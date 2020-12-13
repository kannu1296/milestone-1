package data_types.enum_datatype;

/**
 * program to demonstrate how values can be assigned to enums.
 */
public enum TrafficSignal {
    /**
     * public static final TrafficSignal RED = new TrafficSignal("STOP");
     */
    RED("STOP"), GREEN("GO"), YELLOW("GO SLOW");

    private String actions;

    private TrafficSignal(String actions){
        this.actions = actions;
    }

    public String getActions(){
        return actions;
    }
}
