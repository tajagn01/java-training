package javamarquee.pattern;

public class peramid {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=n-i+1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=n-i+1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        int b = 64;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(b+j));
            }
            System.out.println();
        }

        int d = 64;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print((char)(d+j));
            }
            System.out.println();
        }
    }
}