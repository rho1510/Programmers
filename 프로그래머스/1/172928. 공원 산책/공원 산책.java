import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        int[] start = new int[2];
        
        // 시작 지점 찾기
        for(int i=0;i<park.length;i++){
           if(park[i].contains("S")){
               start[0] = i;
               start[1] = park[i].indexOf("S");
               System.out.println(Arrays.toString(start));
           }
        }
        
        // routes 수행 
        for(int j=0;j<routes.length;j++){
            // routes 방향
            char direction = routes[j].charAt(0);
            // routes 거리
            int distance = Character.getNumericValue(routes[j].charAt(2));
            // 장애물 판별 
            boolean flag = false;
            
            // 서쪽이니까 - 라서 0 이상이면 됨
            if(direction == 'W' && start[1] - distance >= 0){
                // 장애물 판별 // park에서 시작점 - 거리 중에 X가 있는지 
                for(int k=1;k<=distance;k++){
                    if(park[start[0]].charAt(start[1]-k)=='X'){
                        // 장애물 있다면 반복문 break
                        flag = true;
                        break;
                    }
                }
                // 장애물이 없다면 거리 이동
                if(!flag){
                    start[1] -= distance;
                }
            }
            // 동쪽이니까 + 라서 park 배열 안의 String 길이보다만 작으면 됨
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
            // 북 -> 0 이상이면 됨
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
            // 남 -> park 배열의 길이보다 작으면 됨
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
