class Solution {
    public int firstUniqChar(String s) {

        //BRUTE FORCE APPROACH
        
        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     String currentChar = String.valueOf(ch);

            
        //     if (!s.substring(0, i).contains(currentChar) && (!s.substring(i + 1).contains(currentChar) ))  {
        //         return i; // Return the index of the first non-repeating character
        //     }
        // }
        
        // return -1; 




        int[] frequency = new int[26]; // For lowercase letters a-z
        
        // Queue to store characters and their indices
        Queue<Integer> queue = new LinkedList<>();
        
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequency[ch - 'a']++;
            // Add the index of the current character to the queue
            queue.offer(i);
            
            // Check and remove non-unique characters from the front of the queue
            while (!queue.isEmpty() && frequency[s.charAt(queue.peek()) - 'a'] > 1) {
                queue.poll();
            }
        }
        
        // If the queue is not empty, return the index of the first non-repeating character
        if (!queue.isEmpty()) {
            return queue.peek();
        }
        
        return -1;
    }
}