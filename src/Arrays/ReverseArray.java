package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3,19,56,9,83,18,24,85,14};
        int n = arr.length;
        int i = 0, j= n-1; // i starts from beginning (0), j starts from end (n-1 = 8)

        while(i<j){ //Swaps the elements at positions i and j.

            // (i++)Moves i one step forward.

                    // (j--)Moves j one step backward.
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }

    }
}

//You used two pointers (i and j) — one from start, one from end.
//You swapped elements until they met in the middle.
//Finally, you printed the reversed array.
