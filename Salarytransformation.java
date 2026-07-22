package TASK21_07;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Salarytransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            li.add(sc.nextInt());
        }

        for (int x : li) {
            System.out.println(x + (int)(x * 0.1));
        }
        
        sc.close();
    }
}
