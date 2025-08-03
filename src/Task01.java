import java.util.Arrays;
import java.util.List;

public class Task01 {
    public static void run() {
        List<Integer> numbers = Arrays.asList(10, 20, 3, 4, 5, 60, 7, 8, 90, 10);
        numbers.stream().filter(number -> number > 10).forEach(System.out::println);

        List<Integer> graterThan10List = numbers.stream()
                .filter(number -> number > 10)
                .map(number -> number * 2)
                .toList();
        graterThan10List.forEach(System.out::println);
    }
}
