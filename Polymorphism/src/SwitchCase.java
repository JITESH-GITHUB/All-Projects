import jdk.nashorn.internal.ir.ContinueNode;

public class SwitchCase {
    public static void main(String[] args) {

        int days= 1;
        switch (days) {
        
            case 1:
                System.out.println("MONDAY");
break;

            case 2:
                System.out.println("TUESDAY");


            case 3:
                System.out.println("WEDNESDAY");


            case 4:
                System.out.println("THURSDAY");


            case 5:
                System.out.println("FRIDAY");


            case 6:
                System.out.println("SATURDAY");


            case 7:
                System.out.println("SUNDAY");

            default:
                System.out.println("DO NOT MATCH !!!");
        }

    }

}