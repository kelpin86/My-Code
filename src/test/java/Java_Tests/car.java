package Java_Tests;

public class car {
    int year;
    String brand;
    String model;
    static String motor ="Diesel";
    car(int year, String brand, String model){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public  void play(){
        System.out.println(year+" "+brand+" "+model+" "+motor);
    }

    public static void main(String[] args) {




        car c = new car(2019,"BMW","X6");
        c.play();
    }


}
