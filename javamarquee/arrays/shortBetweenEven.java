package arrays;

public class shortBetweenEven {
    public static int shortBetweenEven(int[] arr) {

        int distance = Integer.MAX_VALUE;
        int first = -1;

        for (int last = 0; last < arr.length; ++last) {

            if (arr[last] > 0 && arr[last] % 2 == 0) {

                if (first != -1) {
                    distance = Math.min(distance, last - first);
                }

                first = last;
            }
        }

        return (distance == Integer.MAX_VALUE) ? -1 : distance;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 3, 5, 4, 5, 5, 9, 9, 7, 8, 1 };

        System.out.println(shortBetweenEven(arr));
    }
}