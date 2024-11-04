package year_2024.nov_2024.nov_4;

public class CompressedString {

    public String compressedString(String word) {
        StringBuffer compressed = new StringBuffer();
        int len=1;
        char temp = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i)==temp && len<9){
                len++;
            }else {
                compressed.append(len).append(temp);
                len = 1;
                temp = word.charAt(i);
            }
        }
        return compressed.append(len).append(temp).toString();
    }

    public static void main(String[] args) {
        CompressedString string = new CompressedString();
        System.out.println(string.compressedString("aaaaaaaaaaaaaabb"));
    }
}
