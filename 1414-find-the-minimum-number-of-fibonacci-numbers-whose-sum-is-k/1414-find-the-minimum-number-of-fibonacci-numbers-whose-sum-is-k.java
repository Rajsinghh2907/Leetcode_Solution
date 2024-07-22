class Solution {
    public int findMinFibonacciNumbers(int k) {
        

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);


        while (true) {
            int nextFib = list.get(list.size() - 1) + list.get(list.size() - 2);
            if (nextFib > k) {
                break;
            }
            list.add(nextFib);
        }

        int count = 0;
        int index = list.size() - 1;  // Start with the largest Fibonacci number
        while (k > 0) {
            if (list.get(index) <= k) {
                k -= list.get(index);
                count++;
            }
            index--;
        }
        
        return count;
    }
}