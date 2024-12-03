package year_2024.dec_2024.dec_2;

public class IsPrefixWord {

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] wordArr = sentence.split(" ");
        for (int i = 0; i < wordArr.length; i++) {
            if (wordArr[i].indexOf(searchWord)==0){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        IsPrefixWord isPrefixWord = new IsPrefixWord();
        System.out.println(isPrefixWord.isPrefixOfWord("i am tired","you"));
    }
}
