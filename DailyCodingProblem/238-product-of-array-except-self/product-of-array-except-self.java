class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 0, right = nums.length-1;
        int[] resArr = new int[nums.length];
        int[] prefixProd =new int[nums.length];
        int[] sufffixProd =new int[nums.length];
        prefixProd[0] = 1;
        for(int i =1; i< nums.length;i++){
            prefixProd[i] = nums[i-1] * prefixProd[i-1];
        }
        sufffixProd[nums.length-1] = 1;
        for(int i= nums.length-2;i>=0;i--){
            sufffixProd[i] = nums[i+1] * sufffixProd[i+1];
        }


        //[1,2,3,4] -> prefixProd [1,2,6,24]
        for(int i =0; i< nums.length;i++){

            resArr[i] = prefixProd[i] * sufffixProd[i];
        }
        return resArr;
    }
}