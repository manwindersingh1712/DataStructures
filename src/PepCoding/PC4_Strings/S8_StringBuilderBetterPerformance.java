package PepCoding.PC4_Strings;

public class S8_StringBuilderBetterPerformance {
    public static void main(String[] args) {
        int n = 100000;
        String str = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            str += i;
        }
        long end = System.currentTimeMillis();
        long tp = end - start;
        System.out.println("Time taken by String is:" + tp + " ms");

        StringBuilder sb = new StringBuilder("");
        long startsb = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
        long endsb = System.currentTimeMillis();
        long tpsb = endsb - startsb;
        System.out.println("Time taken by StringBuilder is:" + tpsb + " ms");

    }
}
