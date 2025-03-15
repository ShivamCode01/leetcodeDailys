public class march15 {
    // In best case you should take always an element that is less then val bcz it would eventualy greedy choosing rather than thinking ki if  i choose it i might loose some optimum adjacent to it ,,this is the main catch,, we will not loose optimum as we might further get bigger value then mid so there is no gurantee of it being successed but one with lesser val guarantee and also provide more choise than the next one wala selection
    private int n;
    private boolean solve(int[] nums, int k, int m){
        int count=0;
        for(int i=0; i<n; i++){
            if(nums[i]<=m){
                count++;
                i++;
            }
        }
        return count>=k?true:false;
    }
    public int minCapability(int[] nums, int k) {
        n=nums.length;
        int l=Integer.MAX_VALUE;
        int h=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            l=Math.min(l,nums[i]);
            h=Math.max(h,nums[i]);
        }

        // binary search
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(solve(nums,k,mid)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}
