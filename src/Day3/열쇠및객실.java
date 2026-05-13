package Day3;

import java.util.*;

public class 열쇠및객실 {

    public static void main(String[] args) {

        List<List<Integer>> rooms = Arrays.asList(
                Arrays.asList(1, 3),        // 0번 방: 열쇠 [1]
                Arrays.asList(3, 0, 1),        // 1번 방: 열쇠 [2]
                Arrays.asList(2),        // 2번 방: 열쇠 [3]
                Arrays.asList(0)          // 3번 방: 열쇠 없음
        );
        System.out.println(rooms);

        boolean[] visited = new boolean[rooms.size()];

        dfs(rooms, 0, visited);

        for(boolean v : visited){
            if(!v) {
                System.out.println("f");
            }

        }
        System.out.println("t");


    }

    static void dfs(List<List<Integer>> rooms, int cur, boolean[] visited) {

        visited[cur] = true;

        for (int next : rooms.get(cur)){
            if (!visited[next]) {
                dfs(rooms, next, visited);
            }
        }

    }

}
