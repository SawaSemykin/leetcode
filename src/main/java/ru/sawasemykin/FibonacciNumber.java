package ru.sawasemykin;

public class FibonacciNumber {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(0, 1, 2, n);
    }

    private int fib(int f1, int f2, int i, int n) {
        if (i == n)
            return f1 + f2;

        return fib(f2, f1 + f2, i + 1, n);
    }
}
