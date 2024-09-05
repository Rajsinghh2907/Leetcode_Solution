class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
       int s = 0;
        for (int r : rolls)
            s += r;

        int v = (mean * (n + rolls.length)) - s;
        int avg = v/n;
       int arr[] = new int [n];
       Arrays.fill(arr,avg);
       int rem= v-(avg*n);
       int i=0;
       while(rem!=0 && i<n){
        int a = avg+rem;
        if(a<= 6){
        arr[i]= a;
        rem= avg+rem- arr[i];
       }
        else{ 
        rem= arr[i]+rem -6;
        arr[i]=6;
        }
        i++;
       }

      s=0;
      for(int in : arr){
        if(in<=0 || in>6)
        return new int[0] ;
        s+=in;
      }
      if(s==v)
      return arr;
      else
      return new int[0] ;
    
    }
}