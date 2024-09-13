package Polymorphism;

public class Animal extends cat {
        void add() {
            System.out.println("meau meau");
        }

        public static void main(String[] args) {
           Animal al= new Animal();
            al.add();
        }
    }
