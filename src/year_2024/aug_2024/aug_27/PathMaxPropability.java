package year_2024.aug_2024.aug_27;

public class PathMaxPropability {

    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        double[] maxProb = new double[n];
        maxProb[start] = 1;
        for (int i = 0; i < n-1; i++) {
            boolean noUpdate = true;
            for (int j = 0; j < edges.length; j++) {
                int u = edges[j][0];
                int v = edges[j][1];
                double successProb = succProb[j];
                if(maxProb[u] * successProb > maxProb[v]){
                    maxProb[v] = maxProb[u] * successProb;
                    noUpdate = false;
                }
                if(maxProb[v] * successProb > maxProb[u]){
                    maxProb[u] = maxProb[v] * successProb;
                    noUpdate = false;
                }
            }
            if(noUpdate){
                break;
            }
        }
        return maxProb[end];
    }

    public static void main(String[] args) {
        PathMaxPropability pathMaxPropability = new PathMaxPropability();
        System.out.println(pathMaxPropability.maxProbability(3, new int[][]{{0,1},{1,2},{0,2}}, new double[]{0.5,0.5,0.3},0,2));
    }
}
