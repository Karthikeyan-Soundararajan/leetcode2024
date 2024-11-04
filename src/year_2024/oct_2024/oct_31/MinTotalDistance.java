package year_2024.oct_2024.oct_31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinTotalDistance {

    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        long minDis = 0;
        Collections.sort(robot);
        Arrays.sort(factory, (o1, o2) -> Integer.compare(o1[0],o2[0]));
        int j = 0;
        int curLen;
        int nextLen;
        for (int i = 0; i < robot.size(); i++) {
            int roboPos = robot.get(i);
            curLen = Math.abs(factory[j][0]-roboPos);
            nextLen = Math.abs(factory[j+1][0]-roboPos);
            if (curLen<=nextLen && factory[j][1]>0){
                minDis += curLen;
                factory[j][1]--;
            }else {
                while (nextLen<curLen){
                    curLen = nextLen;
                    j++;
                    nextLen = Math.abs(factory[j][0]-roboPos);
                }
                minDis += curLen;
                factory[j][1]--;
            }
        }
        return minDis;
    }

    public static void main(String[] args) {
        MinTotalDistance minTotalDistance = new MinTotalDistance();
//        System.out.println(minTotalDistance.minimumTotalDistance( new ArrayList<>(Arrays.asList(0,4,6)),new int[][]{{2,2},{6,2}}));
        System.out.println(minTotalDistance.minimumTotalDistance( new ArrayList<>(Arrays.asList(9,11,99,101)),new int[][]{{10,1},{7,1},{14,1},{100,1},{96,1},{103,1}}));
//        System.out.println(minTotalDistance.minimumTotalDistance( new ArrayList<>(Arrays.asList(0,7,-2,4,6)),new int[][]{{2,2},{7,2},{-1,2},{6,2}}));
    }
}
