package year_2024.mar_2024.mar_18;

import java.util.Arrays;

public class Min_Num_Arrows_452 {

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (point1, point2) -> {
            if(point1[0] == point2[0]){
                return Integer.compare(point1[1],point2[1]);
            }
            return Integer.compare(point1[0],point2[0]);
        });
        int count = 0;
        long preLast = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if(preLast >= points[i][0]){
                if (preLast > points[i][1]){
                    preLast = points[i][1];
                }
            }
            else{
                preLast = points[i][1];
                count++;
            }
        }
        return  count+1;
    }

    public static void main(String[] args) {
            Min_Num_Arrows_452 minNumArrows452 = new Min_Num_Arrows_452();
            System.out.println(minNumArrows452.findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}}));
    }
}
