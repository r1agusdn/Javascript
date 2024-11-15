package day10;

public class ArrayFunctionParam {

	public static void main(String[] args) {
		int[] points = {10,20,30,40,50};
		int read = average(points);
		
		System.out.println(read);
		
		
	

	}
	public static int average(int arr[]) {
		
		int sum= 0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum/arr.length;
	}
	}

