package rlagusdn;

public class If_Else문 {

	public static void main(String[] args) {
		
		int temp = 23; // 함수 호출
		AC(temp); // 메소드 호출
		
		alcohol(19);
		}
		
	public static void AC(int temp) { // temp 함수 생성
		if(temp > 25) {
			System.out.println("현재 온도 : "+temp+" 작동 중");
		}
		else
			System.out.println("작동 정지");
		}

		// -----------------------------------------------------
	
	public static void alcohol(int age) {
		if(age >= 19)
			System.out.println("성인");
		else
			System.out.println("미성년자");	
		}
}
