// do not remove imports
import java.util.*;
import java.util.function.Function;

class ArrayUtils {
    // define invert method here
    public static <T> T[] invert(T[] t) {

        //T[] invertedArr = (T[]) new Object[t.length];

        for (int i = 0; i < t.length / 2; i++) {
            T val = t[i];
            t[i] = t[t.length - 1 - i];
            t[t.length - 1 - i] = val;
        }

        return t;
    }
}