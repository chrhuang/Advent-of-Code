import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Elf {
    List<Integer> values = new ArrayList<Integer>();

    public int sumValues() {
        return values.stream().mapToInt(Integer::intValue).sum();
    }
}
