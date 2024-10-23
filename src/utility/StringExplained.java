package utility;

public class StringExplained {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = new String("Apple");
        String s3 = "Apple";
        String s4 = new String("Apple");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s4);
    }
}
