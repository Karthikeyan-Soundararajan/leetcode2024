package year_2024.june_2024.june_27;

public class Center_Star_Graph {

    public int findCenter(int[][] edges) {
        int[] firstEdge = edges[0];
        int[] secondEdge = edges[1];
        if(firstEdge[0] == secondEdge[0] || firstEdge[0] == secondEdge[1]){
            return firstEdge[0];
        }else {
            return firstEdge[1];
        }
    }

    public static void main(String[] args) {
        Center_Star_Graph centerStarGraph = new Center_Star_Graph();
        int[][] array = new int[][]{{1,2},{5,1},{1,3},{1,4}};
        System.out.println(centerStarGraph.findCenter(array));
    }
}
