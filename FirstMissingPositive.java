class Solution {
    public int firstMissingPositive(int[] nums) {
        
      if(nums.length == 1){
        if(nums[0] == 1){
          return 2;
        }
        else{
          return 1;
        }
      }
      else if(nums.length == 0){
        return 1;
      }
      else{
        int max = Math.abs(Arrays.stream(nums).max().getAsInt());
        int tmp[] = new int[max];
        Arrays.fill(tmp,0);
        for(int i=0;i<nums.length;i++){
          if(nums[i] > 0){
            if(tmp[nums[i] - 1]!=1){
              tmp[nums[i]-1] = 1;
            }
          }
        }
        
      for(int i=0;i<tmp.length;i++){
        if(tmp[i] == 0){
          return i+1;
        }
      }
        return max+1;
      }
    }
}