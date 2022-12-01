import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] array = Input.input("example.txt");
        List<Elf> elfs = new ArrayList<Elf>();
        Elf elf = new Elf();
        for (String string : array) {
            if (string.matches("")) {
                elfs.add(elf);
                elf = new Elf();
            }
            else {
                elf.values.add(Integer.parseInt(string));
            }
        }
        if (!elf.values.isEmpty()) {
            elfs.add(elf);
        }
        Integer max = 0;
        for (Elf tmp : elfs) {
            if (max < tmp.sum_values()) {
                max = tmp.sum_values();
            }
        }
        System.out.println(max);
    }
}