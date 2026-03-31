package JavaStreams;

import java.util.*;
public class IOTsensorReading {
    public static void main(String[] args) {
        List<Double> sensorReadings = Arrays.asList(
                22.5, 30.2, 18.7, 35.6, 28.4, 40.1, 25.0
        );
        double threshold = 30.0;
        sensorReadings.stream().filter(reading -> reading > threshold).forEach(reading ->System.out.println("Alert! High Reading: " + reading));
    }
}

