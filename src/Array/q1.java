//Given an array, we have to find the smallest element in the array.
package Array;
import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int [] arr = {2,1,4,6,7,77,55,3};
        Arrays.sort(arr);
        int small = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                small = arr[i];
            }
        }
        System.out.println(small);
    }
}
