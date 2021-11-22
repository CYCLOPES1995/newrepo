package practice;

public class reverseTringVariablewithoutUsingLengthMethod {
	public static void main(String[] args) {
		String s ="GauravSingh";
		char[] a = s.toCharArray();
		int count = 0;
		for(char ch : a) {
			count++;
		}
		for(int i =count-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

}
