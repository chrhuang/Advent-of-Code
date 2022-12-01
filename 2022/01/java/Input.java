import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    public static String[] input(String path) throws IOException {
        ArrayList<String> stngFile = new ArrayList<String>();
        FileReader file = new FileReader(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            stngFile.add(scanner.nextLine());
        }
        String array[] = stngFile.toArray(new String[0]);
        return array;
    }
}