package practice;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println("ENTER THE NUMBER");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0 ;
		while(num>0) {
			int digit = num % 10;
			sum = sum + digit ;
			num = num/10;
			
		}
		System.out.println(sum);
	}

}
