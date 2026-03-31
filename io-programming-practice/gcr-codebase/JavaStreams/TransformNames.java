package JavaStreams;
import java.util.*;
public class TransformNames {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"Anuj","Kulkul","Naitik","Yash"
		);
		list.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
	}

}
