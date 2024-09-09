package year_2024.sep_2024.sep_9;

import utility.ListNode;

import java.util.Arrays;

public class SpiralMatrix4_2 {

    public int[][] spiralMatrix(int rows, int columns, ListNode head) {
        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            matrix[i] = new int [columns];
            Arrays.fill(matrix[i], -1);
        }

        int topRow = 0, bottomRow = rows - 1, leftColumn = 0, rightColumn = columns - 1;
        while (head != null) {

            for (int col = leftColumn; col <= rightColumn && head != null; col++) {
                matrix[topRow][col] = head.val;
                head = head.next;
            }
            topRow++;


            for (int row = topRow; row <= bottomRow && head != null; row++) {
                matrix[row][rightColumn] = head.val;
                head = head.next;
            }
            rightColumn--;


            for (int col = rightColumn; col >= leftColumn && head != null; col--) {
                matrix[bottomRow][col] = head.val;
                head = head.next;
            }
            bottomRow--;


            for (int row = bottomRow; row >= topRow && head != null; row--) {
                matrix[row][leftColumn] = head.val;
                head = head.next;
            }
            leftColumn++;
        }

        return matrix;
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
        SpiralMatrix4_2 spiralMatrix4 = new SpiralMatrix4_2();
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
