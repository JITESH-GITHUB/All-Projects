package Polymorphism;

public class Overloading {
    void sum(int x, int y ){
        System.out.println(x-y);
    }
    void sum(int x, int y, int z){
        System.out.println(x+y+z);
    }

    public static void main(String[] args) {
        Overloading Ol = new Overloading();
        Ol.sum(20,30);
        Ol.sum(100,200,200);
    }

}
