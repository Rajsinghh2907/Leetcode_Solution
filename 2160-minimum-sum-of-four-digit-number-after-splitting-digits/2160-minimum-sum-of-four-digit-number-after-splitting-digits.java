class Solution {
    public int minimumSum(int num) {
        
       ArrayList<Integer> list = new ArrayList<>();

        while(num > 0){
            int ld = num % 10;

            list.add(ld);

            num /= 10;
        }

        Collections.sort(list);

        int ans1 = ( list.get(0) * 10 ) + list.get(2);
        int ans2 =( list.get(1) * 10 ) + list.get(3);

       return ans1 + ans2;
    }
}