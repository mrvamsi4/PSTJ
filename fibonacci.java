package TASK21_07;

public class fibonacci {
    public static void main(String[] args) {
        int terms = 10; // Number of values to print
        int a = 0, b = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
