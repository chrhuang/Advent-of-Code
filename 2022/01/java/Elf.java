import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Elf {
    List<Integer> values = new ArrayList<Integer>();

    public int sum_values()
    {
        return values.stream().mapToInt(Integer::intValue).sum();
    }
}
