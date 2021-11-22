package practice;

public class fibnocci {
	public static void main(String[] args) {
		int num =5;
		int a = 0;
		int b= 1;
		int c ;
		System.out.println(a);
		System.out.println(b);
		for(int i=2 ;i<=num;i++) {
			c=a+b;
			
			System.out.println(c+" ");
			a=b;
			b=c;
		}
		
	}

}
