package Arrays;

public class WaveArray {
    public static void main(String[] args) {
        class Solution {
            public void sortInWave(int arr[]) {
                // Swap the arr[i] and arr[i+1] with each other and increament i+=2.

                // The loop starts at index 0 and jumps two steps at a time (i += 2), because after you swap arr[i] and arr[i+1], both are already in wave order, so you move to the next pair.

                for (int i =0;i<arr.length;i+=2){
                    //If i is the last index, there’s no arr[i+1] to swap with, so the loop stops here.
                    if(i==arr.length-1) break; // if i is at last index, it will break the loop, otherwise it willl show index out of bound
                    // other wise loop lo(i< arr.length-1) tk hi chlao bs.
                    int temp = arr [i]; // store i in temp variable
                    arr[i] = arr[i+1]; // swap arr[i] to arr[i+1]
                    arr[i+1] = temp;

                }





            }
        }


    }


}
