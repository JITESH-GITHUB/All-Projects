package Polymorphism;

public class Second {
    void sum(double x){
        System.out.println("Age= "+x);
    }
    void sum( String y){
        System.out.println("Candidate name= "+y);
    }

    public static void main(String[] args) {
        Second S = new Second();
        S.sum(21.6);
        S.sum("jitesh yadav");
    }

}