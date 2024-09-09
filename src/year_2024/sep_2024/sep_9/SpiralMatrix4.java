package year_2024.sep_2024.sep_9;

import utility.ListNode;

import java.util.Arrays;

public class SpiralMatrix4 {

    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] spiralMatrix = new int[m][n];
        for (int i = 0; i < spiralMatrix.length; i++) {
            int[] result = spiralMatrix[i];
            Arrays.fill(result,-1);
        }
        int[][] directions = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int[] index = new int[]{0,0};
        int[] currentDir = directions[0];
        int i=0;
        while (head!=null){
            spiralMatrix[index[0]][index[1]] = head.val;
            try{
                if (spiralMatrix[index[0]+currentDir[0]][index[1]+currentDir[1]]!=-1)
                    currentDir =  directions[++i%4];
            }catch (Exception e){
                currentDir =  directions[++i%4];
            }
            index[0] += currentDir[0];
            index[1] += currentDir[1];
            head = head.next;
        }
        return spiralMatrix;
    }

    public static void main(String[] args) {
        ListNode next7 = new ListNode(8);
        ListNode next6 = new ListNode(7, next7);
        ListNode next5 = new ListNode(6, next6);
        ListNode next4 = new ListNode(5, next5);
        ListNode next3 = new ListNode(4, next4);
        ListNode next2 = new ListNode(3, next3);
        ListNode next1 = new ListNode(2, next2);
        ListNode head = new ListNode(1, next1);
        SpiralMatrix4 spiralMatrix4 = new SpiralMatrix4();
        int[][] results = spiralMatrix4.spiralMatrix(3,4,head);
        for (int i = 0; i < results.length; i++) {
            int[] result = results[i];
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[j]+" ");
            }
            System.out.println();
        }
    }
}
