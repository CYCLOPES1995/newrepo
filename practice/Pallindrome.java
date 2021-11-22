package practice;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int rev = 0;
		int temp = n;
		while(n>0)
		{
			int digit = n%10;
			rev = rev*10  + digit;
			n = n/10;
		}
		if(temp == rev)
		{
			System.out.println("The nubmer is pallindrome");
		}
		else
		{
			System.out.println("The is not pallindrome");
		}

}
}
