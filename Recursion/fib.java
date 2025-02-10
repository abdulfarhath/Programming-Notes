import java.util.*;

class Fib {
    public static void main(String[] args) {
        Map<Integer, Integer> dp = new HashMap<>(); // n, its answer
        System.out.println(fib(10, dp));
    }

    static int fib(int n, Map<Integer, Integer> dp) {
        if (dp.containsKey(n)) return dp.get(n);
        if (n <= 0) return 0;
        else if (n == 1) return 0;
        else if (n == 2) return 1;

        int result = fib(n - 1, dp) + fib(n - 2, dp);
        dp.put(n, result);
        return result;
    }
}
