// do not remove imports
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define info method here
    public static <T> String info(T[] array) {
        List<T> output = new ArrayList<>(List.of(array));

        return output.toString();
    }
}