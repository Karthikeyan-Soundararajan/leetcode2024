package year_2024.nov_2024.nov_3;

public class RotateString {

    public boolean rotateString(String s, String goal) {
            return s.length()==goal.length() && (s+s).contains(goal);
    }

    public static void main(String[] args) {
        RotateString rotateString = new RotateString();
        System.out.println(rotateString.rotateString("bbbacddceeb","ceebbbbacdd"));
        System.out.println(rotateString.rotateString("abcde","abced"));
    }
}
