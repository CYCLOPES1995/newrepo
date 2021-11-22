package practice;

public class IteratingTheString {
	public static void main(String[] args) {

		String s = "gaurav";
		String res = "";

		for(int i = 0;i<s.length();i++)
		{
			res = res + s.charAt(i);
			System.out.println(res);
		}
	}

}
