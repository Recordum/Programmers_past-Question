package Startup인턴기출;

import java.util.*;
public class Programmers_예산_lv1 {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int count = 0;
        Arrays.sort(d);

        for(int i = 0; i < d.length ; i++){
            count = d[i] + count;
            if(count > budget){
                break;
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] d = {5,4,1,2,3};
        System.out.println(solution(d , 9));

    }
}

