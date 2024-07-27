class Solution {
    public int mySqrt(int x) {
        long l=0, r=x;
        int ans = 0;
        while(l<=r) {
            long mid = (l+(r-l)/2);
            if(mid*mid == x) return (int)mid;
            else if(mid*mid > x) r= mid-1;
            else {
                ans = (int)mid;
                l = mid+1;
            }
        }
        return ans;
    }
}