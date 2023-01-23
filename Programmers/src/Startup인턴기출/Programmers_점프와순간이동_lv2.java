package Startup인턴기출;

public class Programmers_점프와순간이동_lv2 {

    public static int solution(int n) {
        int ans = 0;
        while(n > 0){
           if(n%2 == 1){
               ans++;
           }
           n = n/2;
        }


        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solution(5000));
    }
}
