class Solution {
    public int countKConstraintSubstrings(String s, int k) {

        int count = 0;
        int n = s.length();
        
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                
                String str = s.substring(i, j+1);

                int nz = numz(str);
                int nO = numO(str);

                if( (nz <=k ) || (nO <= k)){
                    count++;
                }
            }
        }

        return count;
    }

    // int z = 0;
    // int o = 0;

    public static int numz(String str){
        int z = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '0'){
                z++;
            }
        }

        return z;
    }

    public static int numO(String str){

        int o = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '1'){
                o++;
            }
        }

        return o;
    }
}