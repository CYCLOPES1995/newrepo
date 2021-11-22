package practice;

public class SumOfFirst3MInimumNmbr {
	public static void main(String[] args) {
		int sum = 0;
		int a[] = {10,20,40,50,30};
		for(int i =0 ;i<a.length;i++) {

			for(int j =i+1;j<a.length;j++) {
				if(a[i]> a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(+a[i]+" ");
		}
		for(int i=0;i<3;i++) {
			sum = sum+a[i];
		}
		System.out.println();
		System.out.println(sum);
	}

}
