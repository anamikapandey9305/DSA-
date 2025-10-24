// To find the sum of the  all element in an array
package Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {-6,8 ,14,-2,23,47,-7};
        //System.out.println(arr[7]); index 7 out of bound for length 7
        int sum=0;
        for(int i=0;i<arr.length;i++){ // loop goes through every element in an array
            sum+=arr[i]; // adding each element to sum


        }
        System.out.println(sum);

    }
}
