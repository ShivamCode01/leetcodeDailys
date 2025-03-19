public class march19 {
    public int minOperations(int[] nums) {
        int res=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0 ){
                if( (i+2)<nums.length){
                    nums[i]=1;
                    nums[i+1]=1^(nums[i+1]);
                    nums[i+2]=1^(nums[i+2]);
                    res++;
                }else{
                    return -1;
                }
            } 
        }
        return res;
    }
}
