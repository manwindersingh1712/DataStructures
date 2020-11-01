package PepCoding.PC4_Strings;

public class S4_Split {
    public static void main(String[] args) {
        String s1 = "abc,def,ghi,jkl mno";

        String[] parts = s1.split(",");

        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }
}
