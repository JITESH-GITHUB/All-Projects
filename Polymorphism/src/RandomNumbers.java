public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD !!!");

        int num= (int) (Math.random()*25);
        System.out.println(num);

        if (num>20)
        System.out.println("Number is greater than 20");

        else if (num>5 && num<10) {
            System.out.println("number lies between 5 and 10");
        }
        else if (num>15 && num<20) {
            System.out.println("number lies between 15 and 20");
        }
        else
            System.out.println("number is less than 20");

    }
}
