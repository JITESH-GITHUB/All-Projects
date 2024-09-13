package Polymorphism;

public class Overloading {
   public void add(int a, double b) {

       System.out.println("Weight=" + (a + b));
    }

  public   void add(String a, double b) {
        System.out.println("NAME= "+a);
        System.out.println("Age= " + b);
    }
   public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Overloading ol = new Overloading();
        ol.add(50, 25.5);
        ol.add("JITESH YADAV",21.6 );
        ol.add(20,30, 50 );
    }


    }

