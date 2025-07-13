import java.util.Arrays;
import java.util.Scanner;
public class FibonacciLogical {
    static int[] fibArray;
    public int fib(int n) {
        if (fibArray[n] == -1) {
            fibArray[n] = fib(n - 1) + fib(n - 2);
        }
        return fibArray[n];
    }
    public static void main(String[] args) {
        FibonacciLogical x = new FibonacciLogical();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        fibArray = new int[n + 1];
        Arrays.fill(fibArray, -1);
        fibArray[0] = 0;
        if (n > 0) fibArray[1] = 1;
        System.out.println("The number entered is: " + n);
        System.out.println("The nth Fibonacci term is: " + x.fib(n));
    }
}