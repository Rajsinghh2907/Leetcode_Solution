class Solution {
    public int minSteps(String s, String t) {


        Map<Character,Integer> map = new HashMap<Character,Integer>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int count=0;
        for(int i = 0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.containsKey(ch) && map.get(ch) > 0){
                map.put(ch, map.get(ch) - 1);
            }
            else{
                count++;
            }
        }
        return count;
    }
}