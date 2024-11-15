package day10;

public class Array1 {

	public static void main(String[] args) {
		double[] arrd= new double[5];
		arrd[0] = 3.12;
		arrd[1] = 1.23;
		
		String[] grade = {"kor", "math", "java"};
		char c[] = {'n','h'};
		
		int arr[] = {1,2,3,2,3,4,5};
		int i;
		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
			arr[2] = 5;
			System.out.println("");
			for(i=0; i<arr.length; i++){
				System.out.print(arr[i]+" ");
			
		}
			System.out.println("");
			for(i=arr.length-1; i>=0; i--){
				System.out.print(arr[i]+" ");
			}
	}

}
