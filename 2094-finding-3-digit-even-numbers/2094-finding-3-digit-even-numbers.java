class Solution {
    public int[] findEvenNumbers(int[] digits) {
        
        Set<Integer> hs = new HashSet<>();
        int n = digits.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    if(i != j && j != k && k != i){
                        int nums = digits[i] * 100 + digits[j]*10 + digits[k];
                        if(digits[i] != 0 && nums % 2 == 0){
                            hs.add(nums);
                        } 
                    }
                }
            }
        }

        int[] result = new int[hs.size()];
        int index = 0;
        for (int num : hs) {
            result[index++] = num;
        }
        Arrays.sort(result);

        return result;


    }
}