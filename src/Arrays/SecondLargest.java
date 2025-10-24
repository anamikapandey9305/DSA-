package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {4,10,6,3,8,8};
        int max = Integer.MIN_VALUE; // stores the largest number
        int smax = Integer.MIN_VALUE; // stores the second largest number
        // INTEGER.MIN_VALUE is the smallest possible integer in java

        // Calculate max
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];

        }
        // calculate second largest
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max) smax = arr[i];
            // arr[i] > smax → current element is bigger than current second largest
            
            //arr[i] != max → current element cannot be the largest

        }
        System.out.println(max);
        System.out.println(smax);

       // First loop: Find the largest number.

//Second loop: Find the largest number smaller than max.


    }
}
