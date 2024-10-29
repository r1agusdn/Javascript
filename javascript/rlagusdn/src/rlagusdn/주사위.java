package rlagusdn;

public class 주사위 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i ++) { // 10개의 주사위 번호 생성하는 반복문
		int num = dice(); // dice 호출 
		System.out.print(num+" ");
		}
	}
	public static int dice() {
		double result = Math.random()*6; // 0~5 중의 랜덤 정수
		return (int)(result + 1); // result에 1을 더해서 반환
	}
}
