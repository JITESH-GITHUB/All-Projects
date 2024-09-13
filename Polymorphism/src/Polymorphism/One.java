package Polymorphism;

public class One {
    void add() {
        System.out.println("HELLO");
    }

    public static class WorldOne extends One {
        @Override
        void add() {
            System.out.println("HEY");
        }

        public static void main(String[] args) {
            WorldOne W1 = new WorldOne();
            W1.add();
        }
    }
}
