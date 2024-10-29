package rlagusdn2;

public class Gugudan {

	public static void main(String[] args) {
		int dan, i;
		for(dan = 2; dan < 10; dan ++) {
			System.out.print(" " + dan + "  /  ");
			for(i = 1; i < 10; i ++) {
				System.out.printf(" %2d * %1d = %2d  ", dan, i, dan*i);
			}
			System.out.println();

		}
	}
}
