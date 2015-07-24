package lesson10;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by ITHILLEL2 on 24.07.2015.
 */
public class Test {
    private static String data = "(()(())(()))))5423(()()()5(((((())))))))((()))";

    public static void main(String[] args) {
        System.out.println(isCorrect(data));

    }
    public static  boolean isCorrect(String string){
        Stack stack = new Stack();
        for (char ch : string.toCharArray()){
            if (ch == '('){
                stack.push(ch);
            } else if (ch == ')'){
               try {
                   stack.pop();
               } catch (EmptyStackException e){
                   return false;
               }
            }
        }
        return stack.isEmpty();
    }
}
