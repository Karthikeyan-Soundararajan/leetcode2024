package year_2024.sep_2024.sep_11;

public class MinBitFlips {

    public int minBitFlips(int start, int goal) {
        String startStr = Integer.toBinaryString(start);
        String goalStr = Integer.toBinaryString(goal);
        int len = Math.max(startStr.length(),goalStr.length());
        if (startStr.length()<len){
            startStr = String.format("%"+len+"s",startStr).replace(" ","0");
        }
        if (goalStr.length()<len){
            goalStr = String.format("%"+len+"s",goalStr).replace(" ","0");
        }
        int[] startArr = startStr.chars().map(x -> x - '0').toArray();
        int[] goalArr = goalStr.chars().map(x -> x - '0').toArray();
        int result = 0;
        len--;
        while (len>=0){
            if ((startArr[len]^goalArr[len])==1)
                result++;
            len--;
        }
        return result;
    }

    public static void main(String[] args) {
        MinBitFlips minBitFlips = new MinBitFlips();
        System.out.print(minBitFlips.minBitFlips(10,7));
    }
}
