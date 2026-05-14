package Day3;

import java.util.*;

public class 가장먼노드 {
    public int solution(int n, int[][] edge) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] a : edge) {
            int k = a[0];
            int v = a[1];

            list.get(k).add(v);
            list.get(v).add(k);
        }
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        queue.add(1);
        visited[1] = true;

        int answer = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            answer = queue.size();

            for (int i = 0; i < size; i++) {
                int cur = queue.poll();

                for (int next : list.get(cur)) {
                    if (!visited[next]) {
                        visited[next] = true;
                        queue.add(next);
                    }
                }

            }
        }
        return answer;
    }
}
