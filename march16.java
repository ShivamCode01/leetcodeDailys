import java.util.Arrays;

public class march16 {
        public boolean solve(int[] ranks, int cars, long k){
        long count=0;
        int i=0;
        while(i<ranks.length){
            count+= Math.sqrt(k/ranks[i]);
            i++;
        }
        return count>=cars;
    }
    public long repairCars(int[] ranks, int cars) {
        // Arrays.sort(ranks);
        long l=1;
        long h =1L * cars * cars * Arrays.stream(ranks).max().orElse(Integer.MIN_VALUE);
        while(l<h){
            long mid=l+(h-l)/2;
            if(solve(ranks,cars,mid)){
                h=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}
