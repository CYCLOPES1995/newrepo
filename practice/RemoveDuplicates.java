package practice;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {


		String s = "GAURAV";

		//Step-1 create set collection and add all character of given string into set

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		//Step-2 compare each character of set with all the character of gvn string 

		for(int i = 0; i<s.length() ;i++) 
		{
			set.add(s.charAt(i));
		}

		for(Character ch : set) {
			System.out.print(ch);
		}
	}
}