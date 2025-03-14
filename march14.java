public class march14 {
    private int n;
    public boolean solve(int c,int[] candies, long k){
        long count=0;
        for(int i=0; i<n; i++){
            count+= candies[i]/c;
        }
        if(count<k){
            return false;
        }else{
            return true;
        }
    }
    public int maximumCandies(int[] candies, long k) {
        n=candies.length;
        int l=1;
        int r=(int)Math.pow(10,7);
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(solve(mid,candies,k)){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
}
