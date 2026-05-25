package javamarquee.function;

public class Function1 {
    public static int Sum(int a, int b){
        int sum = 0;
        for(int i = a;i<=b;i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.print(Sum(5,20));
    }
}
