package TASK23_07;

public class sumofthelasttwodigits {
    public static void main(String[] args) {
        int num = 1986;
        int last = num % 10; 
        int secondLast = (num / 10) % 10; 
        int sum = last + secondLast;
        System.out.println("Sum of last two digits: " + sum);
    }
}
