package practice;

public class FibnocciSeriesTill25 {
	
	public static void main(String[] args) {
		int num =21;
		int a = 0;
		int b= 1;
		int c ;
		System.out.println(a);
		System.out.println(b);
		for(int i=1 ;i<=num;i++) {
			c=a+b;
			System.out.println(c+" ");
			if(c>=21) {
				break;
			}
			a=b;
			b=c;
		}
		
	}


}
