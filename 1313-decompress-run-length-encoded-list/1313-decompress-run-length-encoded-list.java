class Solution {
    public int[] decompressRLElist(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        
    //    int i = 0;

       for(int i = 0; i<nums.length; i = i+2){
        int curr = nums[i];

        int pri = nums[i+1];

        while(curr > 0){
            list.add(pri);

            curr--;
        }
       }

       int a = list.size();

       int ans[] = new int[a];

       for(int i = 0; i<a; i++){
        ans[i] = list.get(i);
       }

       return ans;
    }
}