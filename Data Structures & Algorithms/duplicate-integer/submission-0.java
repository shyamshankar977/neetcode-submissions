class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>1)
            {
                flag=true;
                break;
            }
        }
        if(flag)
        {
            return true;
        }
        return false;

        
    }
}