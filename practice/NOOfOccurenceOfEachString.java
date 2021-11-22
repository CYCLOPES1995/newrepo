package practice;

import java.util.LinkedHashSet;

public class NOOfOccurenceOfEachString {
	public static void main(String[] args) {

		String s = "GAURAV IS A GOOD BOY";

		//Step-1 split the statement

		String[] str = s.split(" ");

		//Step-2 create set collection and add all character of given string into set

		LinkedHashSet<String> set = new LinkedHashSet<String>();

		//Step-3 compare each value of set with all the value of gvn string array

		for(int i = 0; i<str.length ;i++) 
		{
			set.add(str[i]);
		}

		for(String word : set) 
		{
			int count = 0;
			for(int i=0;i<str.length;i++) 
			{
				if(word==str[i]) 
				{
					count++;
				}
			}
			//Step-4 print both word and count

			System.out.println(word+" ===> "+count);

		}

	}


}
