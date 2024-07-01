class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
        int sum = 0;

        for(int i = 0; i < nums.size(); i++){

            if(Integer.bitCount(i) == k){ 
 // The Integer.bitCount(n) method in Java returns the number of one-bits (bits set to 1) in the binary representation of the integer n.                
                sum = sum + nums.get(i);
            }
        }

        return sum;

    }
}