//Given an array, we have to find the largest element in the array.
package Array;

import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        int arr[]= {22,1,2,7,45,54,11,3};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
