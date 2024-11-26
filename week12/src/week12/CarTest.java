package week12;

public class CarTest {

    public static void main(String[] args) {
      
        Car hy1 = new Car("1234", "hyundai", "hyundai X", 10000);
        
       
        hy1.run(30);
        
       
        String result = hy1.toString();
        System.out.println(result);
        
        
        hy1.setColor("red");
        hy1.setMile(20000);
        
       
        result = hy1.toString();
        System.out.println(result); 
    }
}

class Car {
    private String no;
    private String company;
    private String color;
    private int mile;

    
    public Car() {
        no = "0000";
        company = "Korea";
        color = "white";
        mile = 0;
    }

    
    public Car(String no) {
        this.no = no;
    }

    
    public Car(String no, String company) {
        this.no = no;
        this.company = company;
        this.color = "black"; 
    }

    
    public Car(String no, String company, String color) {
        this(no, company);
        this.color = color; }


    public Car(String no, String company, String color, int mile) {
        this(no, company, color); 
        this.mile = mile; 
    }

       public void run(int speed) {
        System.out.println(speed + " km/h로 달린다");
    }


    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMile() {
        return mile;
    }

    public void setMile(int mile) {
        this.mile = mile;
    }

    // toString method to return a string representation of the car
    @Override
    public String toString() {
        return "Car [no=" + no + ", company=" + company + ", color=" + color + ", mile=" + mile + "]";
    }
}
