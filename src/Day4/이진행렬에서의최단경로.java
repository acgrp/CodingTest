package Day4;

import java.util.LinkedList;
import java.util.Queue;

public class 이진행렬에서의최단경로 {

    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};
    static int n, m;

    public static void main(String[] args) {

        int[][] grid = {
                {0, 0, 0},
                {1, 1, 0},
                {1, 1, 0}
        };

        n = grid.length;
        m = grid[0].length;

        if (grid[0][0] != 0) {
            System.out.println("-1");
            return;
        }

        bfs(grid);


    }

    private static int bfs(int[][] grid) {
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int r = cur[0];
            int c = cur[1];
            int dist = cur[2];

            if (r == n - 1 && c == m - 1) {
                return dist;
            }

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    if (grid[nr][nc] == 0 && !visited[nr][nc]) {
                        visited[nr][nc] = true; // 깃발 꽂기
                        queue.add(new int[]{nr, nc, dist + 1});
                    }
                }
            }
        }

        return -1;

    }
}



