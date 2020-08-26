package functionDevelop;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class AnotherFunctionDevelop {

	public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new ConcurrentLinkedQueue<Integer>();
        
        for(int i = 0; i < progresses.length; i++) {
            q.add((100-progresses[i])%speeds[i] == 0? (100 - progresses[i]) / speeds[i]
                    : (100 - progresses[i]) / speeds[i] + 1);
        }
        
        List<Integer> result = new ArrayList<Integer>();
        int standard = q.poll();
        int cnt = 1;
        while(!q.isEmpty()) {
            int num = q.poll();
            if(standard >= num) {
                cnt++;
            }else {
                result.add(cnt);
                cnt = 1;
                standard = num;
            }
        }
        result.add(cnt);
        int[] answer = new int[result.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
