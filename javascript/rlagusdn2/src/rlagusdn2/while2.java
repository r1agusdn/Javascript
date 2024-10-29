package rlagusdn2;

import java.util.Scanner;

public class while2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("dan = ");
        int dan = scan.nextInt();
        
        // Corrected multiplication table loop
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }
        
        // Uncomment to call countdown
        // countdown(5);
        scan.close(); // Closing the scanner
    }

    public static void countdown(int num) {
        System.out.println("Countdown start:");
        while (num > 0) {
            System.out.println(num + "...");
            num--;
        }
        System.out.println("발사");
    }
}
