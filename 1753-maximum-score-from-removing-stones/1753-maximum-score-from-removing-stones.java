class Solution {
    public int maximumScore(int a, int b, int c) {
        
        int[] numbers = {a, b, c};

        Arrays.sort(numbers);

        int smaller = numbers[0];
        int middle = numbers[1];
        int greater = numbers[2];

        if( (smaller + middle) >= greater){
             return (a + b + c) / 2;
        } else {

            return smaller + middle;
        }
    }
}