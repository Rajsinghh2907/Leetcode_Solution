class Solution {
    public boolean isValid(String s) {
        Stack<Character> list =  new Stack<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                list.push(ch);
            }else{
                if(list.isEmpty()){
                    return false;
                }
                if( (list.peek() == '(' && ch == ')')   
                   || (list.peek() == '{' && ch == '}') 
                   || (list.peek() == '[' && ch == ']') ){      
                    list.pop();
                }else{
                    return false;
                }
            }
        }
        if(list.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}