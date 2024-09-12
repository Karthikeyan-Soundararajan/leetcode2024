package year_2024.sep_2024.sep_11;

public class MinBitFlips2 {

    public int minBitFlips(int start, int goal) {
        int count = 0;
        int xor = start ^ goal; // XOR will give 1 where the bits differ

        while(xor!=0){
            count += xor & 1; // Increment count if the last bit is 1
            xor >>=1; // Right-shift to check the next bit
        }
        return count;
    }

    public static void main(String[] args) {
        MinBitFlips2 minBitFlips = new MinBitFlips2();
        System.out.println(minBitFlips.minBitFlips(10,7));
    }
}
