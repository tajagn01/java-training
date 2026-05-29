package function;

public class NcR {
    public static int Fact(int n) {
        long fact = 1;
        for(int i =1; i <= n; i++) {
            fact *= i;
        }
        return (int) fact;
    }
    public static void main(String[] args) {
        int n = 10;
        int r = 5;
        
       int factn = Fact(n);
       int factr = Fact(r);
       int fact_nr = Fact(n-r);
       int NcR = factn / factr *fact_nr;
       System.out.println("nCr = " + NcR);
    }
}
