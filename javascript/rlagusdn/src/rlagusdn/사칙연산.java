package rlagusdn;

public class 사칙연산 {

	public static void main(String[] args) {
	       int result = square(4); // 제곱 계산
	        System.out.println("4의 제곱 = " + result); 
	        
			// -----------------------------------------------------	       
	        
	        System.out.println("절대값 = " + Math.abs(-100)); // 절대값
	        
			// -----------------------------------------------------
	        
	        result = Math.max(2, 7); // 최대값
	        System.out.println("(2, 7)의 최대값 = " + result);
	        
			// -----------------------------------------------------
	        
	        result = Math.min(2, 7); // 최소값
	        System.out.println("(2, 7)의 최소값 = " + result);
	        
			// -----------------------------------------------------
	        
	        result = area(5, 120); // 면적 계산
	        System.out.println("(5, 120)의 면적 = " + result);
	        
			// -----------------------------------------------------
	        
	        result = add(4, 5); // 덧셈
	        System.out.println("(4, 5)의 덧셈 = " + result);
	        
			// -----------------------------------------------------
	        
	        result = sub(50, 3); // 뺄셈
	        System.out.println("(50, 3)의 뺄셈 = " + result);
	    }

	    // 제곱 계산
	    public static int square(int n) {
	        return n * n;
	    }

	    // 면적 계산
	    public static int area(int w, int h) {
	        return w * h;
	    }

	    // 덧셈
	    private static int add(int i, int j) {
	        return i + j;
	    }

	    // 뺄셈
	    private static int sub(int i, int j) {
	        return i - j;
	    }
	}