public class march17 {
    public boolean divideArray(int[] nums) {
        int[] map=new int[501];
        for(int i:nums){
            map[i]++;
        }
        for(int i:map){
            if(i%2!=0){
                return false;
            }
        }
        return true;
    }
}
