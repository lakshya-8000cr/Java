import java.util.*;

public class infix {

    public static int priority(char ch){
        if(ch == '^'){
            return 3;
        } else if(ch == '*' || ch == '/'){
            return 2;
        } else if(ch == '+' || ch == '-'){
            return 1;
        }
        return -1;
    }

    public static String convert(String s){
        Stack<Character> st = new Stack<>();
        String ans = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            // 1. Operand → add to ans
            if(Character.isLetterOrDigit(ch)){
                ans += ch;
            }

            // 2. '(' → push
            else if(ch == '('){
                st.push(ch);
            }

            // 3. ')' → pop until '('
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    ans += st.pop();
                }
                st.pop(); // remove '('
            }

            // 4. Operator
            else {
                while(!st.isEmpty() && priority(ch) <= priority(st.peek())){
                    ans += st.pop();
                }
                st.push(ch);
            }
        }

        // 5. Empty the stack
        while(!st.isEmpty()){
            ans += st.pop();
        }

        return ans;
    }

    public static void main(String[] args){
        String s = "a+b*(c-d)";
        System.out.println(convert(s));
    }
}
