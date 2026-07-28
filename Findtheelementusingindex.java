package TASK23_07;

import java.util.Scanner;

public class Findtheelementusingindex {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new  int[n];
        for(int i=1;i<n;i++){
        	arr[i]=sc.nextInt();
        	
        }
        int indexpos=sc.nextInt();
        if(indexpos<0 || indexpos>=n) {
        	System.out.println("invalid position");
        }
        else {
        	System.out.println(arr[indexpos]);
        }
	}
}
