package rlagusdn;

import java.util.Scanner;

public class While_반복 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수만 입력 : ");
			int num = scan.nextInt(); // 정수를 입력받으면 반복
			if(num == 0)
				break; // 정수가 아닌 수가 나오면 반복 종료
		}

	}

}
