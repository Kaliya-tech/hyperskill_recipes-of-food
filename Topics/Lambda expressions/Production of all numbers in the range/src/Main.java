
import java.util.function.*;


class Operator {

    public static LongBinaryOperator binaryOperator = (long x, long y) -> {

        long res = 1;
        long sum = 0;

        if (x == 0 || x == y) {
            res = x;

        } else {
            for (sum = x; sum <= y; sum++) {
                res *= sum;

            }
        }
        return res;
    };

}