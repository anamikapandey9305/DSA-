
package Arrays;
import java.util.Scanner;

public class OutputInputArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,8,2,67,43,97};// length = 6
        int n = arr.length; // index 0 to n-1;
        for(int i=0;i<=5;i++){
            System.out.println( arr[i]+" ");
        }
        // By default values will be zero.
        int[] karan = new int[7];
        for(int i=0;i<7;i++){
            System.out.println( karan[i]+" ");
        }
        // input
        for(int i =0;i<7;i++){
            int x = sc.nextInt();
            karan[i] = x;


        }
        //print
        for(int i=0; i<7;i++){
            System.out.print( 2*karan[i]+" "); // multiply 2 output
        }




    }
}
