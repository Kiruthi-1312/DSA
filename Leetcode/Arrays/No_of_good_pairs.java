// Given an array of integers nums.

// A pair (i,j) is called good if nums[i] == nums[j] and i < j.

// Return the number of good pairs.


/***********************************************************************************
Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
*************************************************************************************/


/**********************************USING FOR-LOOP*************************************/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        
         for(int i=0;i<nums.length-1;i++)
         {
           for(int j=i+1;j<nums.length;j++)
           {
               if(nums[i]==nums[j])
                    count++;
           }
         }
        
        return count;
    }
}



/*****************************USING HASH MAP*******************************/
class Solution {
    public int numIdenticalPairs(int[] nums) {
int count =0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int i:nums)
        {
            if(hm.containsKey(i))
            {
            count += hm.get(i);
            hm.put(i,count+1);
            }
            else
            hm.put(i,1);
               
        }
       return count;
    }
}
