package arrays;

public class ArrayiD {
    public static void main(String[] args) {
       int[] Array= new int[10];
       System.out.println(Array.length);

        String[] myArray= new String[50];
        System.out.println(myArray.length);

        Array[0]=10;
        Array[2]=20;
        Array[4]=30;

        System.out.println(Array[2]);
        for (int index=0; index<Array.length; index++){
            System.out.println(Array[index]);
        }
    }
}