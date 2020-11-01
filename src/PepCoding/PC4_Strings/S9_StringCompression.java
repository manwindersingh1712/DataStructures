package PepCoding.PC4_Strings;

public class S9_StringCompression {
    public static void main(String[] args) {
        String str = "aabbbccddabbc";
        compression1(str);
        compression2(str);

    }

    private static void compression1(String str) {
        StringBuilder s = new StringBuilder();
        s.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr != prev) {
                s.append(curr);
            }
        }

        System.out.println(s);

    }

    private static void compression2(String str) {
        StringBuilder s = new StringBuilder();
        s.append(str.charAt(0));
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr == prev) {
                count++;
            } else {

                if (count > 1) {
                    s.append(count);
                    count = 1;
                }
                s.append(curr);
            }
        }
        if (count > 1) {
            s.append(count);
        }

        System.out.println(s);

    }
}
