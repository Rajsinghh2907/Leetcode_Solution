class Solution {
    public String removeOccurrences(String s, String part) {
        

        while(s.contains(part)) // String predefine function .contains if yes then trur
        {
            s=s.replaceFirst(part,""); // .replaceFirst() is also String predefine function so if it contain part then replace it by empty string of char
        }
        return s;
    }
}