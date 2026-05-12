package Day2;

import java.util.*;

public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> set = new HashSet<>(Arrays.asList(report));
        // report 중복 제거

        Map<String, Integer> reportedCountMap = new HashMap<>();
        for (String s : set) {
            String reported = s.split(" ")[1];
            reportedCountMap.put(reported, reportedCountMap.getOrDefault(reported, 0) + 1);
        }
        System.out.println(reportedCountMap);
        //신고 횟수 카운팅(받은사람, 횟수)

        Map<String, Integer> map = new HashMap<>();

        for (String str : set) {
            String[] names = str.split(" ");
            String reporter = names[0];
            String reported = names[1];

            if (reportedCountMap.get(reported) >= k) {
                map.put(reporter, map.getOrDefault(reporter, 0) + 1);
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = map.getOrDefault(id_list[i],0);
        }
        return answer;
    }
}