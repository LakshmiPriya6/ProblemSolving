class Solution {
    public void duplicateZeros(int[] arr) {
        int posDups = 0;
        int length_ = arr.length -1;

        for(int left = 0; left <= length_ - posDups; left++){
            if(arr[left] == 0){
                if(left == length_ - posDups){
                    arr[length_] = 0;
                    length_ -= 1;
                    break;
                }
                posDups++;
            }
        }

        int last = length_ - posDups;

        for(int i= last ; i>=0; i--){
            if(arr[i] == 0){
                arr[i+posDups] = 0;
                posDups--;
                arr[i+posDups] = 0;
            } else {
                arr[i+posDups] = arr[i];
            }
        }
    }
}