package Day4;

import java.util.LinkedList;
import java.util.*;

public class 게임맵최단거리 {

    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};
    static int n, m;

    public static void main(String[] args) {

        int[][] maps = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        };

        n = maps.length;
        m = maps[0].length;

        if (maps[0][0] != 1) {
            System.out.println("-1");
        }

        bfs(maps);

    }

    private static void bfs(int[][] maps) {

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
                System.out.println(dist);
            }

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    if (maps[nr][nc] == 1 && !visited[nr][nc]) {
                        visited[nr][nc] = true; // 깃발 꽂기
                        queue.add(new int[]{nr, nc, dist + 1});
                    }
                }
            }
        }

        System.out.println(-1);
        }
    }
