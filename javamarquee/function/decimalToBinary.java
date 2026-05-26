package javamarquee.function;

public class decimalToBinary {
     public static int DecimalToBinary(int n){
    int binary = 0;
    int power = 1;
    while (n>0) {
        int lastDigit = n%2;
        binary += lastDigit*power;
        power*=10;
        n/=2;
    }
    return binary;
}
    public static void main(String[] args) {
        int n = 12 ;
        System.out.println(DecimalToBinary(n));
    }
}
