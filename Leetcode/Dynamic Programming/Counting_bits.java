//Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

/*****************************************************************************************************

Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10

********************************************************************************************************/
class Solution {
    public int[] countBits(int n) {
        
        int[] arr = new int[n+1];
        arr[0]=0;
      
        for(int i=1;i<=n;i++)
        {
            arr[i]=arr[i/2]+i%2;
        }
        return arr;
    }
}



************************************LOGIC*******************************

for
  1 , no of 1s is 0 + 1 = 1
  2 , no of 1s in 1 + 0 = 1
  3 , no of 1s in 1 + 1 = 2
  4 , no of 1s in 2 + 0 = 1
  5 , no of 1s in 2 + 1 = 2
  6 , no of 1s in 3 + 0 = 2 ....
  
