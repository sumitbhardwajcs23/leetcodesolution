class Solution {
    public int findKthPositive(int[] arr, int k) {
         if (k <= arr[0] - 1) {
            return k;
        }
        int l=0;
        int h=arr.length-1;
        
      
        while(l<=h){
            int mid=l+(h-l)/2;
              int diff=arr[mid]-(mid+1);
              if(diff<k)l=mid+1;
              else h=mid-1;
            
        }
        return l+k;
        
    }
}