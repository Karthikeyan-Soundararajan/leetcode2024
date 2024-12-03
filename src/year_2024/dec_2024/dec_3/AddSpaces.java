package year_2024.dec_2024.dec_3;

public class AddSpaces {

    public String addSpaces(String s, int[] spaces) {
        StringBuffer stringBuffer = new StringBuffer();
        int temp = 0;
        for (int i = 0; i < spaces.length; i++) {
            temp = stringBuffer.length()-i;
            stringBuffer.append(s.substring(temp,spaces[i]));
            stringBuffer.append(" ");
        }
        stringBuffer.append(s.substring(stringBuffer.length()- spaces.length));
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        AddSpaces spaces = new AddSpaces();
        System.out.println(spaces.addSpaces("spacing", new int[]{0,1,2,3,4,5,6}));
    }
}
