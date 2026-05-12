package Day1;

import java.util.Arrays;

public class 예산 {    public int solution(int[] d, int budget) {
    int answer = 0;
    Arrays.sort(d);

    for(int price : d){
        budget -= price;
        if(budget < 0) break;
        answer++;
    }
    return answer;
}
}