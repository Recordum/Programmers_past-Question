package Startup인턴기출;
import java.util.*;
import java.util.stream.Collectors;

public class Programmers_숫자게임_lv3 {
    public static int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        int start = 0;

        for(Integer a : A){
            for(int j = start; j < B.length ; j++) {
                if (a < B[j]) {
                    answer++;
                    start = j+1;
                    break;
                }
            }
        }

        return answer;
//        List<Integer> aList = (ArrayList<Integer>) Arrays.stream(A).boxed().collect(Collectors.toList());;
//        List<Integer> bList = (ArrayList<Integer>) Arrays.stream(B).boxed().collect(Collectors.toList());;
//        int answer = 0;
//        int start = 0;
//        Collections.sort(aList);
//        Collections.sort(bList);
//
//        for(Integer a : aList){
//            for(int j = start; j < bList.size() ; j++) {
//                if (a < bList.get(j)) {
//                    answer++;
//                    start = j+1;
//                    break;
//                }
//            }
//        }
//
//        return answer;
        /**
         * stream으로 ArrayList로 변환후 sort 결과
          */
//        테스트 1 〉	통과 (213.93ms, 71.4MB)
//        테스트 2 〉	통과 (198.23ms, 70.1MB)
//        테스트 3 〉	통과 (189.41ms, 69.9MB)
        /**
         * 배열을 바로 Arrays.sort로 한 결과
         */
//        테스트 1 〉	통과 (73.75ms, 68.8MB)
//        테스트 2 〉	통과 (75.84ms, 71.1MB)
//        테스트 3 〉	통과 (127.60ms, 66.5MB)

    }

    public static void main(String[] args) {
        int[] A = {2,2,2,2};
        int[] B = {2,2,1,1};

        System.out.println(solution(A,B));

    }
}
