package Array;

import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
        int [] arr = {2,55,44,21,99,56,77};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n 2nd smallest element: "+arr[1]);
        System.out.print("\n 2nd smallest element: "+arr[arr.length-2]);
    }
}
