package arrays;

import java.util.Scanner;

public class Strongnumber {
    public static int fac(int n){
        if (n==1 || n==0 )  return 1;
        return n*fac(n-1);
    }

    public static int sumOfDigitFactorials(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += fac(digit);
            n /= 10;
        }
        return sum;
    }

    public static boolean isStrongNumber(int n) {
        return sumOfDigitFactorials(n) == n;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOfDigitFactorials(n);
        System.out.println(sum);
        if (isStrongNumber(n)){
            System.out.println(n+" is a strong number");
        }else{
            System.out.println(n+" is  not a strong number");
        }
    }
}
