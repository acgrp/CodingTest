package Day3;

public class 네트워크 {

    public static void main(String[] args) {

        int n = 3;
        int[][] computers = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(computers, i, visited);
                answer++;
            }
        }

        System.out.println(answer);

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
