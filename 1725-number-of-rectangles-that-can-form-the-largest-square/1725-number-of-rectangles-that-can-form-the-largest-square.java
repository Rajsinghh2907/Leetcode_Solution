class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        
        int arr[] = new int[rectangles.length];

        for(int i = 0; i<rectangles.length; i++){

            int Min = Math.min(rectangles[i][0] , rectangles[i][1]);

            arr[i] = Min;
        }

        Arrays.sort(arr);
        int x = arr[arr.length - 1];

        int count = 0;

        for(int i = arr.length - 1; i>=0; i--){
            if(arr[i] == x){
                count++;
            } else{
                break;
            }
        }

        return count;
    }
}