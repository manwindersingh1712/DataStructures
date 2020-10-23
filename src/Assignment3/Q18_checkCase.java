package Assignment3;

import java.util.Scanner;

public class Q18_checkCase {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        char c = scrn.next().charAt(0);

        System.out.println(checkULI(c));

    }

    private static char checkULI(char c) {
        if (Character.isUpperCase(c)) {
            return 'U';
        } else if (Character.isLowerCase(c)) {
            return 'L';
        }
        return 'I';
    }
}
