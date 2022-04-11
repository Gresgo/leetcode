class Solution {
    public boolean isValid(String s) {
        if ((s.length() % 2) != 0) return false;
        Stack<Character> stack = new Stack<Character>();
        String opening = "([{";
        try {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (opening.indexOf(ch) >= 0) {
                    stack.push(ch);
                } else {
                    if (stack.peek() == findOpening(ch)){
                        stack.pop();   
                    } else {
                        return false;
                    }
                }
            }
        } catch(Exception e) {
            return false;
        }
        return stack.empty();
    }
    
    public char findOpening(char c) {
        switch(c) {
            case(')'):
                return '(';
            case(']'):
                return '[';
            case('}'):
                return '{';
        }
        return '$';
    }
}