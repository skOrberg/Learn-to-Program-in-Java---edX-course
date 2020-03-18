public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("For number " + i + " the sum of Fibonacci sequence is: " + fibonacci(i));
        }
    }

    public static int fibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return num = fibonacci(num - 1) + fibonacci(num - 2);
    }
}
