class Solution {
    public int splitNum(int num) {
        
        ArrayList<Integer> list = new ArrayList<>();

        while(num > 0){
            list.add(num % 10);
            num /= 10;
        }

        Collections.sort(list);

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                sum1 = sum1 * 10 + list.get(i);
            } else {
                sum2 = sum2 * 10 + list.get(i);
            }
        }

        return sum1 + sum2;
    }
}