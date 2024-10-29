package rlagusdn2;

public class Array {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i < 10; i ++) {
			sum = sum + 1;
		}
		System.out.println("sum ( 1~10 ) = "+ sum);
		
		sum = 0;
		int i = 1;
		while(i < 10) {
			sum = sum + 1;
			i++;
			System.out.println("sum ( 1~10 ) = "+ sum);
		}
	}

}
