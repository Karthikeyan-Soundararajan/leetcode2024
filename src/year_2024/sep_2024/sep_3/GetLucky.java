package year_2024.sep_2024.sep_3;

import java.math.BigInteger;

public class GetLucky {

    public int getLucky(String s, int k) {
        BigInteger sumOfPos = BigInteger.valueOf(0);
        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            x = s.charAt(i)-96;
            if (x<10){
               sumOfPos = sumOfPos.multiply(BigInteger.TEN).add(BigInteger.valueOf(x));
            } else if (x==10) {
                sumOfPos = sumOfPos.multiply(BigInteger.valueOf(100)).add(BigInteger.valueOf(x));
            } else{
                sumOfPos = sumOfPos.multiply(BigInteger.valueOf(100)).add(BigInteger.valueOf(x));
            }
        }
        while(k!=0){
            int res = 0;
            while (sumOfPos.divide(BigInteger.valueOf(10))!=BigInteger.ZERO){
                res += sumOfPos.mod(BigInteger.TEN).intValue();
                sumOfPos = sumOfPos.divide(BigInteger.TEN);
            }
            res += sumOfPos.mod(BigInteger.TEN).intValue();
            sumOfPos = BigInteger.valueOf(res);
            k--;
        }
        return sumOfPos.intValue();
    }

    public static void main(String[] args) {
        GetLucky lucky = new GetLucky();
        System.out.println(lucky.getLucky("eyndkzgaldjoujyvdpnfnjwijyuqslzwkcfgwass",2));
//        System.out.println(lucky.getLucky("abj",2));
    }
}
