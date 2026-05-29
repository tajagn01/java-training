package arrays;

import java.util.*;

public class Arrays {

    public static boolean linearSearch(int[] arr, int target) {
        for (Integer x : arr) {
            if (x == target) {
                return true;
            }
        }
        return false;

    }
     public static int index(int[] arr, int target){
        int in = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                in = i;
                return in;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
          int n=5;
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[n];
        System.out.println("arr elements:");
        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("target:");
        int target = sc.nextInt();
        System.out.println(linearSearch(arr,target));
        System.out.println(index(arr, target));
        sc.close();

    }

}
