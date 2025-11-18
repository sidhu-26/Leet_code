// 3668. Restore Finishing Order
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You are given an integer array order of length n and an integer array friends.

// order contains every integer from 1 to n exactly once, representing the IDs of the participants of a race in their finishing order.
// friends contains the IDs of your friends in the race sorted in strictly increasing order. Each ID in friends is guaranteed to appear in the order array.
// Return an array containing your friends' IDs in their finishing order.

 

// Example 1:

// Input: order = [3,1,2,5,4], friends = [1,3,4]

// Output: [3,1,4]

// Explanation:

// The finishing order is [3, 1, 2, 5, 4]. Therefore, the finishing order of your friends is [3, 1, 4].

// Example 2:

// Input: order = [1,4,5,3,2], friends = [2,5]

// Output: [5,2]

// Explanation:

// The finishing order is [1, 4, 5, 3, 2]. Therefore, the finishing order of your friends is [5, 2].


import java.util.Arrays;

public class FinishingOrder{


    public static void main(String[] args ){
        int[] arr1 = {3,1,2,5,4};
        int[] frnd = {1,3,4};
        int[] arr2 = {1,4,5,3,2};
        int[] frnd2 = {2,5};

        System.out.println(Arrays.toString(Order(arr1,frnd)));
        System.out.println(Arrays.toString(Order(arr2,frnd2)));

    }

    static int[] Order(int[] arr, int[] frnd){
        int[] ans = new int[frnd.length];
        int n = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < frnd.length ; j++){
                if (arr[i]==frnd[j]){
                    ans[n] = arr[i];
                    n++;
                }
            }
        }
        return ans;



    }
}