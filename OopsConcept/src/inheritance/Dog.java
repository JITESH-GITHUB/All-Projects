package inheritance;

public class Dog extends Animal {
     public void eat2() {
         System.out.println("Dogs Eat Biscuit");
     }

         public static void main (String[]args){
             Dog obj = new Dog();
             obj.eat();
         }
}

