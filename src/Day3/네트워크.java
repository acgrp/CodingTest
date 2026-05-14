package Day3;

public class 네트워크 {

    public int solution(int n, int[][] computers) {

        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(computers, i, visited);
                answer++;
            }
        }

        return answer;
    }

    private static void dfs(int[][] computers, int i, boolean[] visited) {

        visited[i] = true;

        for (int next = 0; next < computers.length; next++) {
            if (computers[i][next] == 1 && !visited[next]) {
                dfs(computers, next, visited);
            }
        }


    }

}
