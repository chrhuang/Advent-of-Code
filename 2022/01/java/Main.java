import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public  static List<Elf> getElfs(String[] array) {
        List<Elf> elves = new ArrayList<Elf>();
        Elf elf = new Elf();
        for (String string : array) {
            if (string.matches("")) {
                elves.add(elf);
                elf = new Elf();
            }
            else {
                elf.values.add(Integer.parseInt(string));
            }
        }
        if (!elf.values.isEmpty()) {
            elves.add(elf);
        }
        return elves;
    }

    public static void resolvePartOne(List<Elf> elves) {
        Integer max = 0;
        for (Elf tmp : elves) {
            if (max < tmp.sumValues()) {
                max = tmp.sumValues();
            }
        }
        System.out.println(max);
    }

    public static void resolvePartTwo(List<Elf> elves) {

        Integer max = 0;

    }
    public static void main(String[] args) throws IOException {
        String[] array = Input.input("first_part.txt");
        List<Elf> elves = getElfs(array);

        resolvePartOne(elves);
    }
}