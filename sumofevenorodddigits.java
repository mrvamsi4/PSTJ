package TASK23_07;

public class sumofevenorodddigits {
    public static void main(String[] args) {
        int num = 12345, even = 0, odd = 0;

        while (num > 0) {
            int d = num % 10;
            if (d % 2 == 0) 
            	{
            	even += d;
            	}
            else {
            	odd += d;
            }
            num /= 10;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}



