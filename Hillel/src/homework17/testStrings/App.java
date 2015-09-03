package homework17.testStrings;

/**
 * Created by yura on 03.09.15.
 */
public class App {

    public static void main(String[] args) {
        int iterations = 100000;
        System.out.println("Total iterations " + iterations);
        long start = System.currentTimeMillis();
        concatWithString(iterations);
        System.out.println("Concat with String operations. Time left: " + (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        concatWithStringBuffer(iterations);
        System.out.println("Concat with StringBuffer operations. Time left: " + (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        concatWithStringBuilder(iterations);
        System.out.println("Concat with StringBuilder operations. Time left: " + (System.currentTimeMillis() - start) + "ms");
    }

    public static String concatWithString(int iterations) {
        String t = "Test";
        for (int i = 0; i < iterations; i++) {
            t += " me";
        }
        return t;
    }

    public static String concatWithStringBuffer(int iterations) {
        StringBuffer sb = new StringBuffer("Test");
        for (int i = 0; i < iterations; i++) {
            sb.append(" me");
        }
        return sb.toString();
    }

    public static String concatWithStringBuilder(int iterations) {
        StringBuilder sb = new StringBuilder("Test");
        for (int i = 0; i < iterations; i++) {
            sb.append("me");
        }
        return sb.toString();
    }


}
