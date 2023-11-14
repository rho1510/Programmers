import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        int[] start = new int[2];
        
        for(int i=0;i<park.length;i++){
           if(park[i].contains("S")){
               start[0] = i;
               start[1] = park[i].indexOf("S");
               System.out.println(Arrays.toString(start));
           }
        }
        
        for(int j=0;j<routes.length;j++){
            char direction = routes[j].charAt(0);
            int distance = Character.getNumericValue(routes[j].charAt(2));
            
            boolean flag = false;
            
            if(direction == 'W' && start[1] - distance >= 0){
                for(int k=1;k<=distance;k++){
                    if(park[start[0]].charAt(start[1]-k)=='X'){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    start[1] -= distance;
                }
            }
            else if (direction == 'E' && start[1] + distance < park[0].length()) {
                for(int k=1;k<=distance;k++){
                    if(park[start[0]].charAt(start[1]+k)=='X'){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    start[1] += distance;
                }
            } 
            else if (direction == 'N' && start[0] - distance >= 0) {
                for(int k=1;k<=distance;k++){
                    if(park[start[0]-k].charAt(start[1])=='X'){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    start[0] -= distance;
                }
            } 
            else if (direction == 'S' && start[0] + distance < park.length) {
                for(int k=1;k<=distance;k++){
                    if(park[start[0]+k].charAt(start[1])=='X'){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    start[0] += distance;
                }
            }
        }
        
        
        return start;
    }
}
