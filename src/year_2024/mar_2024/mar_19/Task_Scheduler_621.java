package year_2024.mar_2024.mar_19;

import java.util.Arrays;

public class Task_Scheduler_621 {

    public int leastInterval(char[] tasks, int n) {
        int[] frequencies = new int[26];
        for (char task : tasks) {
            frequencies[task - 'A']++;
        }
        Arrays.sort(frequencies);
        int maxFrequency = frequencies[25] - 1;
        int idleSlots = maxFrequency * n;

        for (int i = 24; i >= 0 && frequencies[i] > 0; i--) {
            idleSlots -= Math.min(frequencies[i], maxFrequency);
        }
        return idleSlots > 0 ? idleSlots + tasks.length : tasks.length;
    }

    public static void main(String[] args) {
        Task_Scheduler_621 taskScheduler621 = new Task_Scheduler_621();
        System.out.println(taskScheduler621.leastInterval(new char[]{'A','A','A','A','A','A','A','A','A','A','A','B','B','B'},5));
    }
}
