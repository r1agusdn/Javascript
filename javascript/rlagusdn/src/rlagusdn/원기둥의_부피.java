package rlagusdn;

import java.util.Scanner;

public class 원기둥의_부피 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("반지름 : ");
		double r = scan.nextDouble(); // radius = 반지름
											// 메소드 이름 규칙 : 첫 단어 이후의 단어는 전부 대문자
		System.out.print("높이 : ");
		double h = scan.nextDouble(); // height = 높이
		double v = volume(r, h); // volume = 부피
		System.out.println("원기둥의 부피 : "+ v);

	}

	public static double volume(double r, double h) {
		double area_v = Math.PI*r*r*h; // 원기둥의 부피 : 밑면의 넒이 * 높이
		return area_v; // 부피 값 반환
	}
}
