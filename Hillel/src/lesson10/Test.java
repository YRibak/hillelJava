package lesson10;

/**
 * Created by ITHILLEL2 on 24.07.2015.
 */
public class Test {
    private static String data = "(()(())(()))))5423(()()()5(((((())))))))((()))";

    public static void main(String[] args) {
        System.out.println(isCorrect(data));

    }
    public static  boolean isCorrect(String string){
        int i = 0;
        for(char ch : string.toCharArray()){
            if (ch ==')') {
                i++;
            } else if(ch =='('){
                i--;
            }
            if (i<0){
                return false;
            }

        }
        return true;
    }
}
