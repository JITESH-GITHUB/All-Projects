public class Test {
    public static void main(String[] args) {

        System.out.println("Hello JITESH");

        try {
            System.out.println("Hii");
            int i = 9 / 0;
            System.out.println(i);
            System.out.println("Continue");
            System.out.println("Close db connection");

        }
        catch (Throwable t) {

            System.out.println("Error Occurred");
            System.out.println(t.getMessage());
        }
            System.out.println("Close db connection 2");


    }
}






