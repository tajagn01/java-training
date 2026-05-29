package pattern;

public class circle {
    public static void main(String[] args) {
        int r = 10;

        for (int i = -r; i <= r; i++) {

            for (int j = -r; j <= r; j++) {

                if ((i * i) + (j * j) <= (r * r )) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}
