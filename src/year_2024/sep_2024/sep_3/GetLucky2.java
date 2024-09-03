package year_2024.sep_2024.sep_3;

import java.math.BigInteger;

public class GetLucky2 {

    public int getLucky(String s, int k) {
        if (k == 0) {
            BigInteger sumOfPos = BigInteger.valueOf(0);
            int x = 0;
            for (int i = 0; i < s.length(); i++) {
                x = s.charAt(i) - 96;
                if (x < 10) {
                    sumOfPos = sumOfPos.multiply(BigInteger.TEN).add(BigInteger.valueOf(x));
                } else if (x == 10) {
                    sumOfPos = sumOfPos.multiply(BigInteger.valueOf(100)).add(BigInteger.valueOf(x));
                } else {
                    sumOfPos = sumOfPos.multiply(BigInteger.valueOf(100)).add(BigInteger.valueOf(x));
                }
            }
            return sumOfPos.intValue();
        }
        int sumOfPos=0;
        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            x = s.charAt(i) - 96;
            while (x/10!=0){
                sumOfPos+= (x%10);
                x = x/10;
            }
            sumOfPos+= x;
        }
        k--;
        while(k!=0){
            int res = 0;
            while (sumOfPos/10 !=0){
                res += sumOfPos%10;
                sumOfPos = sumOfPos/10;
            }
            res += sumOfPos;
            sumOfPos = res;
            k--;
        }
        return sumOfPos;
    }

    public static void main(String[] args) {
        GetLucky2 lucky = new GetLucky2();
        System.out.println(lucky.getLucky("eyndkzgaldjoujyvdpnfnjwijyuqslzwkcfgwass",2));
//        System.out.println(lucky.getLucky("abj",2));
    }

}
