class Solution {
    public boolean isValid(String s) {

    // Whenever you solve this problem always solve leetcode 678. Valid Parenthesis String Problem
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '('){
                stack.add(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(ch == '}' && top != '{' || ch == ')' && top != '(' || ch == ']' && top != '['){
                    return false;
                }
            }
            
        }
        return stack.isEmpty();
    }
}
