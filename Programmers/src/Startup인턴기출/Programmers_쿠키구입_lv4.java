package Startup인턴기출;


public class Programmers_쿠키구입_lv4 {
    public static int solution(int[] cookie) {
        int answer = 0;


        for (int i = 0; i < cookie.length -1; i++) {
            int left = i;
            int leftTotal = cookie[left];

            int right = i+1;
            int rightTotal = cookie[right];

            while (true){
                if(leftTotal == rightTotal && answer < leftTotal){
                    answer = leftTotal;
                }else if(leftTotal < rightTotal && left != 0){
                    left = left -1;
                    leftTotal = leftTotal + cookie[left];
                }else if(leftTotal > rightTotal && right != cookie.length-1){
                    right = right +1;
                    rightTotal = rightTotal + cookie[right];
                }else {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] cookie = {1,1,2,3};

        System.out.println(solution(cookie));
    }

}
