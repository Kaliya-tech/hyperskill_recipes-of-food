
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {

    public static <T> T getFirst(T[] array) {

        T first = null;
        if (array.length > 0) {
            first = array[0];
        }
        return first;
    }
}