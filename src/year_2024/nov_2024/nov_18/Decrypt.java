package year_2024.nov_2024.nov_18;

import java.util.Arrays;

public class Decrypt {

    public int[] decrypt(int[] code, int k) {
        int[] output = new int[code.length];
        if (k==0){
            return output;
        }
        if (k>0){
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    int l = i+j;
                    if (l>=code.length){
                        l-=code.length;
                    }
                    sum += code[l%code.length];
                }
                output [i] = sum;
            }
        }else {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = Math.abs(k); j > 0; j--) {
                    int l = i-j;
                    sum += code[(l+code.length)%code.length];
                }
                output [i] = sum;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Decrypt decrypt = new Decrypt();
//        System.out.println(Arrays.toString(decrypt.decrypt(new  int[]{5,7,1,4},3)));
        System.out.println(Arrays.toString(decrypt.decrypt(new  int[]{2,4,9,3},-2)));
    }
}
