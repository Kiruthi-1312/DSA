// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

// Return the array in the form [x1,y1,x2,y2,...,xn,yn].


/**********************************************************************************************************************************************************/

/*

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

/*********************************************************************************************************************************************************/


class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m=2*n;
        int x=0;
        int y = n;
        int[] arr1 = new int[m];
        
        for(int i=0;i<m;i=i+1)
        {
            arr1[i]=nums[x];
            x++;
            arr1[++i]=nums[y];
            y++;
        }
        return arr1;
    }
}
