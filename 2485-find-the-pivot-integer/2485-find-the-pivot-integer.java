class Solution {
    public int pivotInteger(int n) {

          
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];


        leftSum[0] = 1;
        for(int i=1; i<n; i++){
            leftSum[i] = (i+1) + leftSum[i-1];
        }
        rightSum[n-1] = n;
        for(int i=n-2;i>=0;i--){
            rightSum[i] = (i+1) + rightSum[i+1];
        }

        for(int i=0; i<n; i++){
            if(leftSum[i] == rightSum[i]){
                return i+1;
            }
        }
    return -1;   
    }
}