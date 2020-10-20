package Java_Tests;

public class test3 {
    void cut(){
        System.out.println("miiyawww");
    }
    static void lion(){
        System.out.println("WOFFFFF");
    }
    void dog(){
        this.cut();
        System.out.println("wof wof");

    }
    public static int Num(int x, int y){
        return x+y;
    }
    public static String na(String a, String b){
        return a=b;
    }

    public static void main(String[] args) {
        test3 t = new test3();
        lion();
        t.dog();
        t.cut();
        System.out.println( Num(90,80));
        System.out.println(na("ali","weli"));
    }

}
