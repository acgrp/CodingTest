package Day3;

import java.util.LinkedList;
import java.util.Queue;

public class 단어변환 {

    public static void main(String[] args) {

        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        Queue<String> queue = new LinkedList<>();
        boolean[] used = new boolean[words.length]; //문자열 상태 확인

        queue.add(begin);

        int count = 0;

        while (!queue.isEmpty()) {
            count++;
            int size = queue.size();

            for (int k = 0; k < size; k++) {
                String cur = queue.poll();

                for (int j = 0; j < words.length; j++) {
                    if (used[j]) {
                        continue;
                    }

                    int diff = 0;
                    for (int i = 0; i < cur.length(); i++) {
                        if (cur.charAt(i) != words[j].charAt(i)) {
                            diff++;
                        }
                    }
                    if (diff == 1) {
                        if (words[j].equals(target)) {
                            System.out.println(count);
                        }
                        used[j] = true;
                        queue.add(words[j]);
                    }
                }


            }
        }
        System.out.println(0);
    }

}

