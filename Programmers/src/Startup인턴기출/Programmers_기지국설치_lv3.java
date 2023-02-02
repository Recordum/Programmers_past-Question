package Startup인턴기출;

public class Programmers_기지국설치_lv3 {
    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        int j = 0;
        for(int i = 1; i <= n; i++){
            if(i >= stations[j] - w && i <= stations[j] + w){
                i = stations[j] + w;
                if(j < stations.length-1){
                    j++;
                }
                continue;
            }
            answer++;
            i = i + 2*w;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] station = {0};
        System.out.println(solution(16,station,2));
    }
}
