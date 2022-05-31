import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        int sumSquareEven = Arrays.stream(numbers)
                .filter(x -> x % 2 == 0)
                .reduce(0, (sum, elem) -> sum + elem * elem);
        return sumSquareEven;
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        int[] sortedOddsArray = Arrays.stream(numbers).filter(x -> x % 2 != 0).sorted().toArray();
        // TODO replace return with your code
        return sortedOddsArray;
    }
}