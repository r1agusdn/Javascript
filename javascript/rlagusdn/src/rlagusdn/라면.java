package rlagusdn;

import java.util.Scanner;

public class 라면 {

    public static void main(String[] args) {
        make_ramen Scanner = new make_ramen();
        Scanner.start();
    }
}

class make_ramen {
    Scanner scan = new Scanner(System.in);
    boolean buy = false;
    boolean boil = false;
    boolean cook = false;
    boolean seasoning = false;
    boolean egg = false;

    public void start() {
        while (true) {
            menu();
        }
    }

    public void menu() {
        System.out.println(" ");

        if (!buy) {
            System.out.println("1. 라면을 구매한다");
        } else {
            if (!boil) {
                System.out.println("2. 물을 끓인다");
            }
            if (boil && !cook) {
                System.out.println("3. 면을 넣는다");
            }
            if (cook && !seasoning) {
                System.out.println("4. 스프를 넣는다");
            }
            if (seasoning && !egg) {
                System.out.println("5. 계란을 넣는다");
            }
            if (egg) {
                System.out.println("6. 맛있게 먹는다");
            }
        }
        
        System.out.println("0. 종료");

        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                buy();
                break;
            case 2:
                if (buy) {
                    boil();
                } else {
                    System.out.println("먼저 라면을 구매해야 한다");
                }
                break;
            case 3:
                if (boil) {
                    cook();
                } else {
                    System.out.println("먼저 물을 끓여야 한다");
                }
                break;
            case 4:
                if (cook) {
                    sourceput();
                } else {
                    System.out.println("먼저 면을 넣어야 한다");
                }
                break;
            case 5:
                if (seasoning) {
                    eggput();
                } else {
                    System.out.println("먼저 스프를 넣어야 한다");
                }
                break;
            case 6:
                if (egg) {
                    eat();
                    System.exit(0);
                } else {
                    System.out.println("먼저 계란을 넣어야 한다");
                }
                break;
            case 0:
                System.out.println("라면을 완성하지 못했다");
                System.exit(0);
                break;
            default:
                System.out.println("다시 시도하시오");
        }
    }
    public void buy() {
        System.out.println("1. 진라면 \n2. 신라면 \n3. 삼양라면");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("진라면을 선택함");
                buy = true;
                break;
            case 2:
                System.out.println("신라면을 선택함");
                buy = true;
                break;
            case 3:
                System.out.println("삼양라면을 선택함");
                buy = true;
                break;
            default:
                System.out.println("다시 시도하시오");
        }
    }

    public void boil() {
        System.out.println("물을 끓임");
        boil = true;
    }

    public void cook() {
        System.out.println("면을 넣음");
        cook = true;
    }

    public void sourceput() {
        System.out.println("스프를 넣음");
        seasoning = true;
    }

    public void eggput() {
        System.out.println("계란을 넣음");
        egg = true;
    }

    public void eat() {
        System.out.println("잘먹었습니다");
    }
}
