package data_types.enum_datatype;

public class TrafficSignalTest {
    public static void main(String[] args) {
        TrafficSignal[] trafficSignal = TrafficSignal.values();
        for(TrafficSignal signal: trafficSignal){
            System.out.println(signal.name()+":"+signal.getActions());
        }
    }
}
