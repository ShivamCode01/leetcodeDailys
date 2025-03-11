public class march11 {
    public int numberOfSubstrings(String s) {
        int ans=0;
        int n=s.length();
        int[] arr=new int[3];
        int j=0;
        for(int i=0; i<n; i++){
            arr[s.charAt(i)-'a']++;
            while(arr[0]>=1 && arr[1]>=1 && arr[2]>=1){
                ans+=n-i;
                arr[s.charAt(j)-'a']--;
                j++;
            } 
        }
        return ans;
    }
}
