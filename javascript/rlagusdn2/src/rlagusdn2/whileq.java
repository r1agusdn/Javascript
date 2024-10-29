package rlagusdn2;

import java.util.Scanner;

public class whileq {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("data = ");
			String data = scan.next();
		if(data.equals("q")) {
			break;
		}
		else {
			System.out.print(data);
		}
		}
	}
}

