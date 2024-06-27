class Solution {
    public boolean canWinNim(int n) {
        
        if(n <= 3){
            return true;
        }

        if(n % 4 == 0){
            return false;
        }

        return true;
    }
}


// If we see the pattern, the we can see than every number which is a divisible of 4 is a lose and else are wins.

// 1 --> win
// 2 --> win
// 3 --> win
// 4 --> lose - because i cant pick more than 3 and even if i pick i stone the other person can pick three and win.
// 5 --> win - i can pick first stone and let the other person pick others and its a win in any case.
// 6 --> win - similar to case of 5 stones
// 7 --> win
// 8 --> lose

// Therefore if n is divisible by 4 then its a lose, otherwise its a win.