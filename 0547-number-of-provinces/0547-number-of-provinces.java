class Solution {
    void dfs(int[][] graph,boolean[] visited,int node){
        visited[node] =true;
        for(int i=0;i<graph.length;i++){
            if(graph[node][i]==1 && !visited[i]){
                dfs(graph,visited,i);
            }
        }

    }
    public int findCircleNum(int[][] isConnected) {
        int n= isConnected.length;
        boolean[] visited = new boolean[n];
        int province =0;
        for(int j=0;j<n;j++){
            if(!visited[j]){
                dfs(isConnected, visited, j);
                province++;
            }
        }
        return province;
    }
}