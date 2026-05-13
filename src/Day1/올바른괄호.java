package Day1;

import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {

        String s = "()()";

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c=='('){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
//                    return false;
                }

                stack.pop();
            }
        }

//        return stack.empty();
    }
}