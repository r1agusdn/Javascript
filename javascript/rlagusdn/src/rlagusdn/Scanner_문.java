package rlagusdn;

import java.util.Scanner; // Scanner 클래스를 사용

public class Scanner_문 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scan 이라는 Scanner 클래스 변수 생성
		
		System.out.println("이름 : "); // name을 입력받기
		
		String name = scan.next(); // 입력받은 값을 반환
		System.out.println("이름 : "+name); // 출력
		
		String food;
		food = "치킨";
		System.out.println("내가 좋아하는 음식 : "+food); // 출력
		
		// -----------------------------------------------------

		final String A ="B"; // final = 변수 수정 불가
			
	}

}