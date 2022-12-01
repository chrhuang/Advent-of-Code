import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] array = Input.input("example.txt");
        Elf[] elfs;

        Elf elf = new Elf();
        for (String string : array) {
            if (string.matches("")) {
//                Create a new elf
            }
            else {
//              Add string value in elf.values
            }
        }
        Elf elf = new Elf();
        elf.values = new Integer[] { 1, 2, 3, 4};
        System.out.println(elf.sum_values());
    }
}