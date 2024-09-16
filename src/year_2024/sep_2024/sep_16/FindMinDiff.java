package year_2024.sep_2024.sep_16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinDiff {

    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        int minDiff = Integer.MAX_VALUE;
        int prevMins = 0,curMins = 0;
        if (timePoints.size() > 0){
            String[] timeValues = timePoints.get(0).split(":");
            prevMins = (Integer.parseInt(timeValues[0])*60)+Integer.parseInt(timeValues[1]);
            String[] endTimeValues = timePoints.get(timePoints.size()-1).split(":");
            curMins = (Integer.parseInt(endTimeValues[0])*60)+Integer.parseInt(endTimeValues[1]);
            if (prevMins<=720&&curMins>=720){
                minDiff = (1440 - curMins) + prevMins;
            }
        }

        for (int i = 1; i < timePoints.size(); i++) {
            String[] timeValues = timePoints.get(i).split(":");
            curMins = (Integer.parseInt(timeValues[0])*60)+Integer.parseInt(timeValues[1]);
            if (minDiff > (curMins-prevMins)){
                minDiff = curMins-prevMins;
            }
            prevMins = curMins;
        }
        return minDiff;
    }

    public static void main(String[] args) {
        FindMinDiff minDiff = new FindMinDiff();
//        System.out.println(minDiff.findMinDifference(Arrays.asList("00:00","23:59","00:00")));
          System.out.println(minDiff.findMinDifference(Arrays.asList("00:00","23:00","00:15")));
    }
}
