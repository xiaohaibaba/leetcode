package 斐波那契;

public class FIBDemo {

    public static void main(String[] args) {
        int i = fib1(64);
        System.out.println(i);
    }

    public static int fib1(int n) {
        if(n<=1) return n;
        return fib1(n - 1) + fib1(n - 2);
    }

    public static int fib2(int n) {
        if (n <= 1) return n;
        int one = 0;
        int second = 1;
        for (int i = 0; i < n - 1; i++) {
            second = one + second;
            one = second - one;
        }
        return second;
    }
}
