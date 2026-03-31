package JavaStreams;
import java.util.*;
public class StockPriceLogger {
	public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(
                152.35,
                153.10,
                151.75,
                154.20,
                155.00,
                153.85
        );
        stockPrices.stream().forEach(System.out::println);
	}
}
