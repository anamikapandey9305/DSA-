package Arrays;

public class MaximumElement {
    public static void main(String[] args) {
         int [] arr={-6,7,8,923,76,89}; // given array
         int max= arr [0]; // start with first element. intializes a variable max with the first element of the array, which is -6.

         for(int i=1;i<arr.length;i++){
             if( arr[i]>max) max= arr[i]; // Checks if the current element (arr[i]) is greater than the current maximum (max).
              //If yes, update max with the new larger value. If no, max stays the same.

         }
        System.out.println(max);

    }
}
