class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        
        int arr[] = new int[num_people];
        int i = 1;

        int c = 0;

        while(candies > 0){

            if(candies < i){
                arr[c] +=  candies;
                break;
            }
            arr[c] += i;
            candies = candies - i;
            i++;  c++;

            c = c % num_people;
        }
        return arr;
    }
}