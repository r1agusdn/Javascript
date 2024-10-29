package rlagusdn;

import java.io.Console;

public class 기초 {

	public static void main(String[] args) {
	String name; // 문자열 변수 name 생성
	name = "김현우"; // 문자열 값 대입
	
	System.out.println("제 이름은 "+name+" 입니다"); // 출력
	
	// -----------------------------------------------------
	
	int midscore; // 중간고사 점수
	int finalscore; // 기말고사 점수
	
	midscore = 100;
	finalscore = 100;

	System.out.println("중간 고사 점수는 "+midscore+" 점입니다");
	System.out.println("기말 고사 점수는 "+finalscore+" 점입니다");
	
	// -----------------------------------------------------
	
	double rating; // 실수형 변수 생성 
	rating = 99.99; // 변수에 값 지정
	
	System.out.println("영화 평점 : "+rating);
	
	// -----------------------------------------------------
	
	boolean israining; // 논리형 변수 생성
	israining = true; // 논리값 = true
	
	if (israining)
	System.out.println("우산이 필요하다"); // true
	else
	System.out.println("우산이 필요하지 않다"); // false
	
	// -----------------------------------------------------
	
	String message = "hello"; // 변수 생성 및 초기화
	System.out.println(message); // 변수명 : message -> hello
	
	message = "goodbye"; // 새로 값 대입
	System.out.println(message); // 변수명 : message -> goodbye
	
	// -----------------------------------------------------
	
	String origin = "ABCD";
	
	String copy = origin;
	System.out.println(copy); // ABCD
	
	copy = copy + "EFG"; //
	System.out.println(copy); // ABCDEFG
	
	// -----------------------------------------------------
	
	String item = "ramen"; // %s = String 값 삽입
	int price = 1500; // %d = int 값 삽입
	double weight = 0.12; //  %f = double 값 삽입
	boolean discount = false; // %b = boolean 값 삽입
	
	System.out.printf("상품 : %s / 가격 : %d / 무게 : %f / 할인 : %b"
			          + "    " , // 공백
					   item, price, weight, discount);
	
	// -----------------------------------------------------
	
	int X = 7/2; // 3.5 -> 3
	double Y = 7 * 2.0; // 14 -> 14.000000
	System.out.printf("x = %d Y = %f"
			         + "    " , // 공백
					   X, Y);
	
	// -----------------------------------------------------
	
	String strSeven = "7"; // 문자열 변수 생성
	String strPi = "3.14";
	
	int a = Integer.parseInt(strSeven); // 문자열 -> 숫자열
	double b = Double.parseDouble(strPi);
	
	double c = a + b ; // 정수 + 실수
	
	System.out.printf("%d + % .2f = %.2f", 
					  
					   a, b, c); // 형식 문자열 출력
	
	}
	
}