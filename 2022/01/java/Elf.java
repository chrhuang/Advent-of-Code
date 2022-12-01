import java.util.Arrays;

public class Elf {
    Integer[] values;

    public int sum_values()
    {
        return Arrays.stream(values)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
