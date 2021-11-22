package practice;

public class Separate_Char_Num_spcl {

	public static void main(String[] args) {
		String s= "G1@U$5R8A#V";
		String alpha = "";
		String num = "";
		String spl = "";
		
		for(int i= 0; i<s.length();i++) 
		{
			if((s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='a' && s.charAt(i)<='z')) 
			{
				alpha = alpha + s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num = num + s.charAt(i);
			}
			else 
			{
			   spl = spl + s.charAt(i);	
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(spl);

	}

}
