package Startup인턴기출;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Programmers_스킬트리_lv2 {
    //정답 코드
    private static int solution2(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i = 0; i < skill_trees.length ; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j< skill_trees[i].length(); j++){
                for(int k = 0 ; k< skill.length(); k++) {
                    if (skill_trees[i].charAt(j) == skill.charAt(k)) {
                        sb.append(skill.charAt(k));
                    }
                }
            }
            if((skill.contains(sb.toString()) && sb.toString().indexOf(skill.charAt(0)) != -1)|| sb.length() == 0||sb.toString().equals(skill)){
                answer = answer +1;
            }
        }

        return answer;
    }

    //replaceAll 및 정규식
    private static int solution1(String skill, String[] skill_trees){
        ArrayList<String> skillTrees = new ArrayList<>(Arrays.asList(skill_trees));
        int answer;
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        return answer = skillTrees.size();
    }
    public static void main(String[] args) {
        System.out.println(solution1("CBD", new String[]{"C", "D", "CB", "BDA"}));
    }



    // 오답 : 스킬트리에 필수 스킬이 하나도 존재하지 않아도 카운트 해야함.
    public static int solutionIncorrect(String skill, String[] skill_trees) {
        int answer = 0;


        for(int i = 0; i< skill_trees.length; i++) {
            boolean[] preSkill = new boolean[skill.length()];
            int comp = -1;
            if(skill_trees[i].indexOf(skill.charAt(0)) == -1){
                continue;
            }
            preSkill[0] = true;
            comp = skill_trees[i].indexOf(skill.charAt(0));
            for(int k = 1; k<skill.length() ; k++){
                if(comp <  skill_trees[i].indexOf(skill.charAt(k)) && preSkill[k-1] == true) {
                    comp = skill_trees[i].indexOf(skill.charAt(k));
                    preSkill[k] = true;
                }else if (comp >= skill_trees[i].indexOf(skill.charAt(k)) && skill_trees[i].indexOf(skill.charAt(k))!= -1){
                    break;
                }else if (skill_trees[i].indexOf(skill.charAt(k)) != -1 && preSkill[k-1] == false){
                    break;
                }

                if(k == skill.length() -1 && comp > -1){
                    answer = answer +1;
                }
            }

        }
        return answer;
    }
}
