package practice;

import java.util.Scanner;

public class StringIsPallindromeOrNot {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		String rev = "";
		String temp = s;
		for(int i = s.length()-1;i>0;i--) {
			rev = rev + s.charAt(i);
		}
			if(temp.equals(temp))
			{
				System.out.println("The string is pallindrome");
			}
			else
			{
				System.out.println("The string is not pallindrome");
			}
		}
		
		
}
