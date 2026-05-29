package function;

public class Secondlast {
     public static boolean isEven(int n){
        int secondLastDigit = (n/10)%10;
        return secondLastDigit%2==0;
    }
     public static void main(String[] args) {
        int n = 12315;
        System.out.println(isEven(n));
    }
}
