package function;

public class add3number {

    public static int add3numberValue(int a, int b, int c){
        return a + b + c;
    }

    public static double areaOfCircle(double r) {
        return Math.PI * r * r;
    }

    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
      
        System.out.println("The answer is : " + add3numberValue(2, 3, 4));
        System.out.println("Area of circle  : " + areaOfCircle(2.5));
        System.out.println("Table for 5:");
        printTable(5);

    }
}
