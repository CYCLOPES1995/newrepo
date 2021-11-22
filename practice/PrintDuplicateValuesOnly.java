package practice;

import java.util.HashSet;

public class PrintDuplicateValuesOnly {
public static void main(String[] args) {
		
		String s = "GAURAV";
		
		//Step-1 create set collection and add all character of given string into set
		
		HashSet<Character> set = new HashSet<Character>();
		
		//Step-2 compare each character of set with all the character of gvn string 
		
		for(int i = 0; i<s.length() ;i++) 
		{
			set.add(s.charAt(i));
		}
		
		for(Character ch : set) 
		{
			int count = 0;
			for(int i=0;i<s.length();i++) 
			{
				if(ch==s.charAt(i)) 
				{
					count++;
				}
			}
			//Step-3 print both char of set and set
			if(count>1)
			System.out.println(ch+" ===> "+count);
			
		}
	}

}
