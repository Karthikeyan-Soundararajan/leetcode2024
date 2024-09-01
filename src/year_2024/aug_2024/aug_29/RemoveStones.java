package year_2024.aug_2024.aug_29;

public class RemoveStones {

    public int removeStones(int[][] stones) {
        int res = 0;
        boolean[] visited = new boolean[stones.length];
        for (int i = 0; i < stones.length; i++) {
            int prex = stones[i][0];
            int preY = stones[i][1];
            boolean isMatchFound = false;
            for (int j =i+1; j < stones.length; j++) {
                    if (prex == stones[j][0] || preY == stones[j][1]) {
                        isMatchFound = true;
                    }
            }
            visited[i] = isMatchFound;
            if(!isMatchFound)
                res++;
        }
        for (int i = 0; i < visited.length; i++) {
            if(visited[i]){
                res++;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        RemoveStones stones = new RemoveStones();
        System.out.println(stones.removeStones(new int[][]{{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}}));
        System.out.println(stones.removeStones(new int[][]{{0,1},{1,0},{1,1}}));
        System.out.println(stones.removeStones(new int[][]{{0,1},{1,2},{1,3},{3,3},{2,3},{0,2}}));
    }
}
