class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else {
                if(stack.isEmpty()){
                    return false;
                }else{
                    char top = stack.peek();
                    if(ch == ')' && top != '('){
                        return false;
                    }else if(ch == ']' && top != '['){
                        return false;
                    }else if(ch == '}' && top != '{'){
                        return false;
                    }else{
                        stack.pop();
                    }
                }
            }
        }

        return (stack.size() == 0);

    }
}
