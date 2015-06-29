package homework3;

import java.util.Scanner;

/**
 * Created by yura on 29.06.15.
 */
public class XorDecoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String text;
        text = scanner.nextLine();
        System.out.print("Input key-string: ");
        String key;
        key = scanner.nextLine();

        String encryptedLine;
        encryptedLine = encryptDecrypt(text, key);
        System.out.println(encryptedLine);

        String decryptedLine;
        decryptedLine = encryptDecrypt(encryptedLine, key);
        System.out.println(decryptedLine);
    }

    public static String encryptDecrypt(String text, String key){
        char[] byteText = text.toCharArray();
        char[] byteKey = key.toCharArray();
        char[] result = new char[byteText.length];
        for (int i=0; i<byteText.length; i++){
            result[i] = (char) (byteText[i] ^ byteKey[i % byteKey.length]);
        }
        return new String(result);
    }

}
