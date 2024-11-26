package week12;

public class 사칙연산test {

    public static void main(String[] args) {
       
        사칙연산 정수 = new 사칙연산(3, 4);
        사칙연산 실수 = new 사칙연산(6, 7);

        System.out.println(정수.toString());
        System.out.println(실수.toString());
    }
}

class 사칙연산 {
    int num1;
    int num2;

   
    public 사칙연산(int num1, int num2) {
        this.num1 = num1; 
        this.num2 = num2;
    }

   
    public int add() {
        return num1 + num2;
    }

 
    public int sub() {
        return num1 - num2;
    }

   
    public int mul() {
        return num1 * num2;
    }

    public double div() {
        return (double) num1 / num2;
    }

    @Override
    public String toString() {
        return "사칙연산 [num1=" + num1 + ", num2=" + num2 + ", add=" + add() + ", sub=" + sub() + ", mul=" + mul() + ", div=" + div() + "]";
    }
}
