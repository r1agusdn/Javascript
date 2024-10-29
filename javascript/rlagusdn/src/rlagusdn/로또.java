package rlagusdn;

public class 로또 {

	public static void main(String[] args) {
		int num = 0; // 변수 초기화
		for(int i = 1; i <= 6; i ++) { // 6개를 생성하는 반복문
			num=lotto(); // lotto 호출
			System.out.print(num+"  "); // 출력
		}

	}
	public static int lotto() { // 랜덤 생성하는 메소드 : lotto
		int lottonum = (int)(Math.random()*46); // 0~45 중의 랜덤 정수
		return lottonum; // 반환
	}
}
