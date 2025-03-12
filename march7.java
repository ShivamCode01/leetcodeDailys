class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans=0;
        int r=0;
        int l=0;
        while(r<k){
            if(blocks.charAt(r)=='W')ans++;
            r++;
        }
        int res=ans;
        while(r<blocks.length()){
            char a=blocks.charAt(r);
            char b=blocks.charAt(l);
            if(a=='W' && b=='B'){
                ans++;
            }else if(a=='B' && b=='W'){
                ans--;
            }
             res=Math.min(res,ans);
             r++;
             l++;
        }
        return res;
    }
}