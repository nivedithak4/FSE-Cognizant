import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class task23 {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            Scanner reader = new Scanner(file);
            System.out.println("Contents of file.txt:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}