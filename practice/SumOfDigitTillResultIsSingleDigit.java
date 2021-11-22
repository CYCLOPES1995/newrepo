package practice;

import java.util.Scanner;

public class SumOfDigitTillResultIsSingleDigit {

	public static void main(String[] args) 
	{
		System.out.println("ENTER THE NUMBER");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num>9) {
			int sum = 0 ;
			while(num>0) 
			{
				int digit = num % 10;
				sum = sum + digit ;
				num = num/10;


			}
			num = sum;
		}
		System.out.println(num);
	}


}
