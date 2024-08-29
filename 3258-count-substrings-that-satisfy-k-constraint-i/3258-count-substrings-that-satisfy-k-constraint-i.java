class Solution {
    public int countKConstraintSubstrings(String s, int k) {


        // Fully Brute Force

//         int count = 0;
//         int n = s.length();
        
//         for(int i = 0; i<n; i++){
//             for(int j = i; j<n; j++){
                
//                 String str = s.substring(i, j+1);

//                 int nz = numz(str);
//                 int nO = numO(str);

//                 if( (nz <=k ) || (nO <= k)){
//                     count++;
//                 }
//             }
//         }

//         return count;
//     }

//     // int z = 0;
//     // int o = 0;

//     public static int numz(String str){
//         int z = 0;
//         for(int i = 0; i<str.length(); i++){
//             if(str.charAt(i) == '0'){
//                 z++;
//             }
//         }

//         return z;
//     }

//     public static int numO(String str){

//         int o = 0;
//         for(int i = 0; i<str.length(); i++){
//             if(str.charAt(i) == '1'){
//                 o++;
//             }
//         }

//         return o;
//     }
// }




 int n = s.length();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int zeros = 0;
            int ones = 0;
            
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '0') {
                    zeros++;
                } else {
                    ones++;
                }
                
                // Check the k-constraint
                if (zeros <= k || ones <= k) {
                    count++;
                } else {
                    break; // No need to check further as the condition won't hold for longer substrings
                }
            }
        }
        
        return count;
    }
}