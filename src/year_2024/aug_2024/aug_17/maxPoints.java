package year_2024.aug_2024.aug_17;

public class maxPoints {

    public long maxPoints(int[][] points) {
        int max = 0,preIndex=0;
        for (int i = 0; i < points[0].length; i++) {
            if(points[0][i]>max){
                max= points[0][i];
                preIndex=i;
            }
        }
        int currMax = 0, curMaxIndex=0;
        for (int i = 1; i < points.length; i++) {
            currMax = points[i][0] - Math.abs(preIndex-0);
            for (int j = 1; j < points[i].length; j++) {
                if (currMax<(points[i][j]-Math.abs(j-preIndex))){
                    currMax = points[i][j]-Math.abs(j-preIndex);
                    curMaxIndex = j;
                }
            }
            max += currMax;
            preIndex = curMaxIndex;
        }
        return max;
    }

    public static void main(String[] args) {
        maxPoints points = new maxPoints();
        System.out.println(points.maxPoints(new int[][]{{2,4,0,5,5},{0,5,4,2,5},{2,0,2,3,1},{3,0,5,5,2}}));
    }
}
