package Startup인턴기출;

public class Programmers_스티커모으기2_LV3 {
    public static int solution(int sticker[]) {
        int answer = 0;
        int[] dp1 = new int[sticker.length];
        int[] dp2 = new int[sticker.length];
        if(sticker.length == 1){
            answer = sticker[0];
            return answer ;
        }

        dp1[0] = sticker[0];
        dp1[1] = dp1[0];

        dp2[0] = 0;
        dp2[1] = sticker[1];

        // dp1 마지막 수 제외
        for(int i = 2; i < sticker.length -1 ; i++) {
            dp1[i] = Math.max(dp1[i-1],dp1[i-2] + sticker[i]);
        }
        // dp2 첫번쨰 수 제외
        for(int i = 2 ; i < sticker.length ; i++) {
            dp2[i] = Math.max(dp2[i-1],dp2[i-2] + sticker[i]);
        }
        answer = Math.max(dp1[sticker.length-2], dp2[sticker.length-1]);
        return answer;
    }

    public static void main(String[] args) {
        int[] sticker = {5, 1, 16, 17, 16};
        int answer = solution(sticker);
        System.out.println("answer = " + answer);
    }
}
