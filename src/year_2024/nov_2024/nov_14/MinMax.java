package year_2024.nov_2024.nov_14;

public class MinMax {

    public int minimizedMaximum(int n, int[] quantities) {
        int loopIndex = 1;
        int minPossibleShare = Integer.MAX_VALUE;
        while (minPossibleShare!=n){
            int tempDivSum = 0;
            for (int i = 0; i < quantities.length; i++) {
                if (quantities[i]%loopIndex!=0){
                    tempDivSum += ((quantities[i]/loopIndex) +1);
                }else {
                    tempDivSum += quantities[i]/loopIndex;
                }
            }
            minPossibleShare = Math.min(minPossibleShare,tempDivSum);
            loopIndex++;
        }
        return --loopIndex;
    }

    public static void main(String[] args) {
        MinMax minMax = new MinMax();
        System.out.println(minMax.minimizedMaximum(6,new int[]{11,6}));
        System.out.println(minMax.minimizedMaximum(7,new int[]{15,10,10}));
        System.out.println(minMax.minimizedMaximum(1,new int[]{100}));
        System.out.println(minMax.minimizedMaximum(2,new int[]{5,7}));
    }
}
