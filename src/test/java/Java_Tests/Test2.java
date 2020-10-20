package Java_Tests;

import java.util.*;

public class Test2 {
    int age;
    String name;
    String adress ;
    static String Nationality ="Uyghur";
    Test2(int a , String b){
        age =a;
        name =b;
    }
    Test2(int a, String b, String c){
        age = a;
        name =b;
        adress =c;

    }
    static {
        System.out.println("Salam Dunya");
    }
   public  void display(){
        System.out.println(age+" "+ name+" "+adress +" "+Nationality);
    }

    public static void main(String[] args) {


        Test2 test = new Test2(19, "Ali", "GreenRD");
        Test2 test1 = new Test2(21, "Azat");
        test.display();
        test1.display();


        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("3");
        list.add("34");
        System.out.println(list);

        Vector<String> v = new Vector<String>();
        v.add("Merdan");
        v.add("Azat");
        v.add("Mira");
        v.add("Mustafa");
        System.out.println(v);

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "London");
        map.put(2, "New York");
        map.put(3, "Amsterdam");
        System.out.println(map);

        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(1,"a");
        m.put(2,"w");
        m.put(2,"d");
        System.out.println(m);













    }
}
