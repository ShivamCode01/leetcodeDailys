import java.util.Arrays;

public class march13 {
    private int n;
    private int Q;

    public boolean solve(int k,int[] nums, int[][] queries){
        int[] diff=new int[n];

        for(int i=0; i<=k; i++){
            int a=queries[i][0];
            int b=queries[i][1];
            int val=queries[i][2];

            diff[a]+=val;
            if(b+1<n){diff[b+1]-=val;}
        }

        int cumSum=0;  
        for(int i=0; i<n; i++){
            cumSum += diff[i];
            diff[i] = cumSum;

            if (nums[i] - diff[i] > 0) { //nums[i] 0 nahi ban paya
                return false;
            }
        }
        return true;
    }
    public int minZeroArray(int[] nums, int[][] queries) {
        n = nums.length;
        Q = queries.length;

        if (Arrays.stream(nums).allMatch(x -> x == 0)) {
            return 0; //no query required because all are already zero
        }

        int ans=-1;
        int l=0;
        int r=Q-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(solve(mid,nums,queries)){
                ans=mid+1;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}
