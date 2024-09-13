public class ArrayException {
    public static void main(String[] args) {

        int[] array = new int[5];
        System.out.println(array);

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        //array[6] = 60;
        for (int index = 0; index <= array.length; index++) {
            System.out.println(array[index]);

            // System.out.println(array[4]);

        }
    }
}