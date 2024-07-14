class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        ArrayList<Boolean> ans = new ArrayList<>(); // create Boolean List

        for(int i = 0; i<r.length; i++){

            int NewArr[] = Arrays.copyOfRange(nums, l[i] , r[i] + 1); // Create NewArray of element give in l[i] and r[i] means subArray 

            boolean x = check(NewArr); // call the Check function to check it satisfy the Arithmetic equation or not

            ans.add(x);  // add the boolean value
        }

        return ans;
    }

    private boolean check(int[] NewArr){
        Arrays.sort(NewArr); // first we sort the given SubArray 

        int diff = NewArr[1] - NewArr[0]; // now the check the firtst difference 

        for(int i = 2; i<NewArr.length; i++){
            if( (NewArr[i] - NewArr[i - 1]) != diff){ // if differewnce is not same return false 
                return false;
            }
        }

        return true; // if all condition are true then return true 
    }
}