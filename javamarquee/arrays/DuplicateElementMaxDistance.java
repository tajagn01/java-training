package arrays;

public class DuplicateElementMaxDistance {
    public static int maxDuplicateDistance(int[] arr) {
        int maxDistance = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    int distance = j - i;
                    if (distance > maxDistance) {
                        maxDistance = distance;
                    }
                }
            }
        }
        return maxDistance;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 2, 1};
        System.out.println(maxDuplicateDistance(arr));
    }
}