package Startup인턴기출;
import java.util.HashMap;
import java.util.Map;

public class Programmers_영어끝말잇기_lv2 {

    public static int[] solution(int n, String[] words){
        int[] answer = new int[2];
        Map<String, Integer> check = new HashMap<>();
        for(int i = 0; i < words.length ; i++) {
            check.put(words[i], 0);
        }
        check.put(words[0], 1);
        for(int i = 1; i < words.length ; i++){
            if(check.get(words[i]) == 1){
               answer[0] = i % n +1;
               answer[1] = i / n +1;
                break;
            }
            if(words[i].charAt(0) != words[i - 1].charAt(words[i-1].length() -1)){
                answer[0] = i % n +1;
                answer[1] = i / n +1;
                break;
            }
            check.put(words[i], 1);
        }


        return answer;
    }
    public static void main(String[] args) {
            String[] w = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
            int[] answer = solution(3, w);
            System.out.println(answer[0] + " " + answer[1]);
    }
}
