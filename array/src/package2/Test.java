package package2;

import package1.first;

public class Test extends first {
    public static void main(String[] args) {

        System.out.println(first.publicvariable);
       // System.out.println(privatevariable);
        System.out.println(first.protectedvariable);
       // System.out.println(defaultvariable);
    }
}