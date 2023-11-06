import java.util.*;

class Solution {
    public List<Integer> solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> answer = new ArrayList<>();
        int sum=0;
        
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<name.length;i++){
            map.put(name[i],yearning[i]);    
        }
        
        for(int i=0;i<photo.length;i++){
            sum=0;
            for(int j=0;j<photo[i].length;j++){
                if(map.get(photo[i][j])!=null){
                    sum+=map.get(photo[i][j]);        
                }
            }
            answer.add(sum);
        }
        
        return answer;
    }
}