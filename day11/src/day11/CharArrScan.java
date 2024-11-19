package day11;

import java.util.Scanner;

public class CharArrScan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1. 배열에 키보드로 받은 문자를 입력하시오.
		char[] ch = new char [10];
		//2. while 문으로 받아오되, 'r' 로 빠져나오시오.
		int i = 0;
		while(true) {
			System.out.print("문자 입력 >> ");
			String str = scan.next();
			ch[i] = str.charAt(0);
			System.out.print(ch[i] + "   ");
			if(ch[i] == 'r' || ch[i] == 'R') {
				System.out.println("종료알림");
				break;
			}
				
		}
	}

}
