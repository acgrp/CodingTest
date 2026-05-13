package Day3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 열쇠및객실2 {

    public static void main(String[] args) {

        List<List<Integer>> rooms = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(3, 0, 1),
                Arrays.asList(2),
                Arrays.asList(0)
        );
        System.out.println(rooms);

        boolean[] visited = new boolean[rooms.size()];

        bfs(rooms, 0, visited);

        boolean result = true;

        for (boolean v : visited) {
            if (!v) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }

    static void bfs(List<List<Integer>> rooms, int start, boolean[] visited) {

        // 1. 큐 생성
        Queue<Integer> queue = new LinkedList<>();

        // 2. 시작방 큐에 넣기
        queue.add(start);

        // 3. 시작방 방문 체크
        visited[start] = true;

        // 4. 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {

            // 5. 큐에서 방 꺼내기
            int cur = queue.poll();

            // 6. 현재 방 열쇠 목록 순회
            for (int next : rooms.get(cur)) {

                // 7. 아직 안 간 방이면
                if (!visited[next]) {

                    // 8. 방문 체크 후 큐에 추가
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}
