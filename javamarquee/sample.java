package javamarquee;

import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        final byte a = 10;
//        final byte b = 20;

//        byte c = a + b;
//        System.out.println(c);
//
//        double d1 = 99.9999943;
//        int d2 = (int) d1;
//        System.out.println(d1);
//        System.out.println(d2);

//        int z = 47;
//        char ch = (char) z;
//        System.out.println(ch);
//        if(a != 10)
//            System.out.println("Java");
//        else
//            System.out.println("Hello");
//            System.out.println("Bye");

        int a = 5;
        int b = 1;
        int c = 40;

//        System.out.println((a > b ? a : b)>c ?(a > b ? a : b):c );
//
//        int age = sc.nextInt();
//
//        System.out.println(age > 18 ? "Eli" : "Not Eli");

        int ans = a++ + ++a*a++;
        System.out.println(ans);
        System.out.println(a);
        System.out.println(++b + b++ + --b + b--);




    }
}
