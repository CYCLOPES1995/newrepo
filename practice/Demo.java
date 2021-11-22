package practice;

import java.util.HashMap;
import java.util.HashSet;

public class Demo {
	
	public static void main(String[] args) {
		
	String str="aaabbcccdd";
	HashSet<Character> hs= new HashSet();
	for(int i =0;i<str.length();i++)
	{
		hs.add(str.charAt(i));
	}
	for(Character ch:hs)
	{int count =0;
		for(int j =0 ; j<str.length();j++)
		{
		if(ch.equals(hs))
			count++;
		}
		System.out.print(ch+count);
	}
	
	}	

}
