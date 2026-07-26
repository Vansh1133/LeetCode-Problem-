class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int result = 0;
        while(left<=right ){
            int mid = left +(right -left)/2;
            long sqrt = (long) mid *mid;
              if(x == sqrt ){
                return mid ;
              }
              else if(sqrt<x){
               result =mid;
                left = mid+1;
              }
              else{
                right = mid -1;
              }
              

        }
        return result ;
    }
}