import java.util.*;

class Solution {
    public ArrayList solution(String[] names) {
        // String[] answer = new String[names.length / 5 + 1];
        
        ArrayList<String> answer = new ArrayList<>();
      
        for(int i=0; i<names.length; i+=5){
            answer.add(names[i]);
        }
        
        return answer;
    }
}