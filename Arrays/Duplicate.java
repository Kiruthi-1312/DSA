// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.


/***************** USING SET *********************/
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> dup = new HashSet<Integer>();
        for(int i : nums)
        {
            if(dup.contains(i))
                return i;
            dup.add(i);
        }
        return -1;
    }
}



/*****************USING CYCLE DETECTION (FLYOD'S TORTOISE AND HARE )******************************/
class Solution {
    public int findDuplicate(int[] nums) {
       int tort = nums[0];
        int hare = nums[0];
        
        do{
            tort = nums[tort];
            hare = nums[nums[hare]];
            
        }while(tort!=hare);
        tort = nums[0];
        while(tort!=hare)
        {
            tort = nums[tort];
            hare = nums[hare];
        }
        return hare;
    }
}
