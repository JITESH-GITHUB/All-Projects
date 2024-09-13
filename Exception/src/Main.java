public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Starting");

        try {
            int a = 50, b = 30, c = 20;
            System.out.println(a + b + c);
            {

                for (int i = 0; i <= 10; i++) {
                    if (i <= 10) {
                        System.out.println(i);
                        System.out.println("number is less than 10");
                    }
                    //  System.out.println(i);
                }
                System.out.println("Continue");
            }
        }
        catch(Exception e){
                System.out.println("Error Occurred");
                System.out.println(e.getMessage());
                e.printStackTrace();

            }
        finally{
                System.out.println("okay");
            }
            System.out.println("Ending");
        }



}