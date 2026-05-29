import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
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
