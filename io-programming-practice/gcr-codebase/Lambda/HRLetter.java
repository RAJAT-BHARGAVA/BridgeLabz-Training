import java.util.*;
import java.util.stream.Collectors;

public class HRLetter {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Rajat", "Amit", "Neha");

        List<String> upperNames =
                names.stream()
                     .map(String::toUpperCase)
                     .collect(Collectors.toList());

        System.out.println(upperNames);
    }
}