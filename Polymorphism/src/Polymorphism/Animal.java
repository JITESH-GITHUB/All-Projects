package Polymorphism;

public class Animal {
    void cat(){
        System.out.println("EAT FOOD");
    }
    public static class dog extends Animal
    {
        void cat() {
            System.out.println("DOG BARKS");
        }

        public static void main(String[] args) {
           dog d = new dog();
            d.cat();
        }
    }

}
