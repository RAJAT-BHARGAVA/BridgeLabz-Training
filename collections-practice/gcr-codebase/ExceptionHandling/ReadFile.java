import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {

        try {
            // Try to open the file
            FileReader reader = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            // Read and print file content line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file
            br.close();
        }
        catch (IOException e) {
            // If file is not found or any IO error occurs
            System.out.println("File not found");
        }
    }
}
