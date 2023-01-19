package Startup인턴기출;

public class Programmers_멀쩡한사각형_lv2 {
    public static long solution(int w, int h) {
        long answer = 1L;
        long width = Long.valueOf(w);
        long height = Long.valueOf(h);
        long gcd = getGCD(width,height);
        return answer =  width*height -(width+height-gcd);
    }

    public static long getGCD(long w, long h) {
        long big;
        long small;
        if(w>=h){
            big = w;
            small = h;
        }else {
            big = h;
            small = w;
        }

        if(big % small == 0){
            return small;
        }
        return getGCD(small, big%small);
    }

    public static void main(String[] args) {

        System.out.println(solution(8, 12));
    }
}
