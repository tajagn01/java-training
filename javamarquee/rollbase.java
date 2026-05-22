package javamarquee;
import java.util.*;

public class rollbase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String val = sc.nextLine();
//
//        switch (val){
//            case "admin":
//                System.out.println("You get access of admin");
//                break;
//            case "student":
//                System.out.println("You get access of Student");
//                break;
//            case "teacher":
//                System.out.println("You get access of Teacher");
//                break;
//            case "guest":
//                System.out.println("You get access of Guest");
//                break;
//            default:
//                System.out.println("You can't get any access");
//        }
//        int num = sc.nextInt();

//        int sum = 0;
//        for(int i=1; i<=20; i++){
//            sum += i;
//        }
//        System.out.println(sum);
//
//        int battary = 10;
//        int min = 0;
//        while(battary<100){
//            battary += 10;
//            min += 1;
//        }
//        System.out.println(min);

//
//
//        int num = 131;
//        int n = num;
//        int ans = 0;
//        while(num > 0){
//            int rem = num%10;
//            ans = ans*10 + rem;
//            num /= 10;
//        }
//        if(ans == n) {
//            System.out.println("Is palindrom");
//        }else{
//            System.out.println("Is not palindrom");
//        }


        int n = sc.nextInt();
        int temp = n;
        int t = n;
        int ans = 0;
        int count=0;
        while(temp>0){
            temp/=10;
            count++;
        }
        while(t>0){
            int rem = t%10;
            ans += Math.pow(rem, count);
            t /= 10;
        }
        if( ans == n){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }

    }
}
