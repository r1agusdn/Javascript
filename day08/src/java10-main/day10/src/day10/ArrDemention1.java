package day10;

public class ArrDemention1 {

	public static void main(String[] args) {
		int[][]gugudan =new int[10][10];
		for(int i =0; i<10; i++) {
		for(int j=0; j<10; j++) {
			
		 gugudan[i][j]=i*j;
		}
		}
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%2d", gugudan[i][j]);
			}
		System.out.println(" ");
	}
	}
		


}
