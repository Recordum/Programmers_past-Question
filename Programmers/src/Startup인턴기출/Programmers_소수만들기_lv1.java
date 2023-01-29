package Startup인턴기출;

public class Programmers_소수만들기_lv1 {

    static public int solution(int[] nums) {
            int answer = 0;
            for(int i = 0 ; i < nums.length ; i++){
                for(int j = i+1; j < nums.length; j ++){
                    for(int k = j+1 ; k < nums.length; k++){
                       int  result = nums[i] + nums[j] + nums [k];
                            if(primeNumber(result) == true){
                                answer++;
                            }
                    }
                }
            }
            return answer;
        }

    private static boolean primeNumber(int number) {
        for(int i = 2 ; i < number ; i++){
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,10,11,111,12,13,45,16,121};

        System.out.println(solution(num));
    }
}
