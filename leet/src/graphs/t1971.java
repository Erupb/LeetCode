package graphs;

import java.lang.reflect.Array;

class t1971 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph = createGraph(n, edges);

        List<Integer> visited = new ArrayList<Integer>(Collections.nCopies(n, 0));
        return dfs(graph, visited, Integer.valueOf(source), Integer.valueOf(destination));
    }

    public ArrayList<Integer>[] createGraph(int n, int[][] edges){
        ArrayList<Integer>[] graph = (ArrayList<Integer>[]) Array.newInstance(ArrayList.class, n);

        for(int i=0; i<n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        return graph;
    }

    public boolean dfs(ArrayList<Integer>[] graph, List<Integer> visited, Integer current, Integer end){
        if(current == end) return true;
        if(visited.get(current) == 1) return false;

        visited.set(current, 1);

        for(int i=0; i<graph[current].size(); i++){
            if(dfs(graph, visited, (graph[current]).get(i), end))
                return true;
        }
        return false;
    }
}