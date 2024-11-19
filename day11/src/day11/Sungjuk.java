package day11;

public class Sungjuk {

	public static void main(String[] args) {
		String[] names = {"tom","ann","jun","jack","jhon","alen"};
		int[] kor = { 50, 30, 90, 55, 66, 77};
		int[] math = { 33, 44, 55, 99, 67, 88};
		int i =0;
		int sum2 = 0;
		int sum [] = new int [6];
		int [] avg = new int [6];
		for( i = 0; i < names.length; i ++ ) {
			sum [i] = math [i] + kor [i];
			avg [i] = (int) sum [i] / 2;
		}
		System.out.println("no     name       kor     math     total   avg");
		System.out.println("----------------------------------------------");
		for( i = 0; i < names.length; i ++ ) {
			System.out.printf("%-3d   %3s        %3d     %3d      %3d     %d\n", 
					         (i+1),   names[i],  kor[i], math[i], sum[i], avg[i]);

	}

		
	//int total[] = new int [4];
	int mathsum = 0, korsum = 0, totalsum = 0, avgsum = 0;
		for ( i = 0; i < 6; i ++ ) {
			mathsum += math[i];
			korsum  += kor[i];
			totalsum += sum[i];
			avgsum  += avg[i];
				
		}
	  
		System.out.print("-------------------------------------------- ");
		System.out.print("전체 총합");
		System.out.printf(" %3d   %3d   %3d   %3d  ",
						 korsum, mathsum, totalsum, (int)avgsum/6);
	}}

	