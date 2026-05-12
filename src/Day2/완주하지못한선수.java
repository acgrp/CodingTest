package Day2;

import java.util.HashMap;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String human : participant) {
            map.put(human, map.getOrDefault(human, 0) + 1);
        }

        for (String human : completion) {
            map.put(human, map.get(human) - 1);
        }

        for (String key : map.keySet()) {
            if(map.get(key) != 0){
                return key;
            }
        }
        return participant[0];
    }
}