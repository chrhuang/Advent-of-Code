import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

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

    public static Elf resolvePartOne(List<Elf> elves) {
        Elf max_elf = elves.get(0);
        for (Elf elf : elves) {
            if (max_elf.sumValues() < elf.sumValues()) {
                max_elf = elf;
            }
        }
        System.out.println(max_elf.sumValues());
        return max_elf;
    }

    public static void resolvePartTwo(List<Elf> elves) {
        Integer index = 0;
        Integer result = 0;

        elves.sort(Comparator.comparing(Elf::sumValues).reversed());
        while (index < 3) {
            result += elves.get(index).sumValues();
            index++;
        }
        System.out.println(result);
    }
    public static void main(String[] args) throws IOException {
        String[] array = Input.input("first_part.txt");
        List<Elf> elves = getElfs(array);

//        resolvePartOne(elves);
        resolvePartTwo(elves);
    }
}