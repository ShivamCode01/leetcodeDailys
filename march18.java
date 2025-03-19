public class march18 {
    public int longestNiceSubarray(int[] nums) {
        int usedBits=0;
        int start=0;
        int len=0;
        for(int end=0; end<nums.length; ++end){
            while((usedBits & nums[end])!=0){
                // remove the element form left of widow(sliding window)
                usedBits^=nums[start];
                start++;
            }
            // add current number to the window
            usedBits |=nums[end];
            len=Math.max(len,end-start+1);
        }
        return len;
    }
}
