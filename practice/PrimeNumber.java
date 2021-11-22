package practice;

import java.util.Scanner;

public class PrimeNumber {
 public static void main(String[] args) {
	System.out.println("ENTER THE NUMBER");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	boolean flag = true;
	for(int i=2; i<=num/2 ;i++) {
		if(num%i==0) {
			flag = false;
			break;
		}
	}
	if(flag) {
		System.out.println("NUMBER IS PRIME");
	}
	else {
		System.out.println("NUMBER IS NOT PRIME");
	}
}
}
