class Predicate {
    public static final TernaryIntPredicate ALL_DIFFERENT = (x, y, z) ->  {
        return x != y && x != z && y != z;
    };

    @FunctionalInterface
    public interface TernaryIntPredicate {
        boolean test(int x, int y, int z);
    }
}