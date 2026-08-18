import java.util.Stack;

class Solution {

    public char getval(char ch) {
        switch(ch) {
            case ']': return '[';
            case '}': return '{';
            case ')': return '(';
            default: return ' ';
        }
    }

    public boolean isValid(String s) {

        String opening = "({[";
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()) {

            if(opening.indexOf(ch) != -1) {
                st.push(ch);
            }
            else {
                if(st.size() == 0)
                    return false;

                char tmp = st.pop();

                if(getval(ch) != tmp)
                    return false;
            }
        }

        return st.size() == 0;
    }
}