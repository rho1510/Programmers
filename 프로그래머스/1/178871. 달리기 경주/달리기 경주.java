import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> answer = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            answer.put(players[i], i);
        }
        
        for (int i = 0; i < callings.length; i++) {
            int curIndex = answer.get(callings[i]);
            
            if(curIndex>0){
                int newIndex = curIndex - 1;
                
                String player1 = players[curIndex];
                String player2 = players[newIndex];
                
                players[curIndex] = player2;
                players[newIndex] = player1;
                
                answer.put(callings[i],newIndex);
                answer.put(player2,curIndex);
            }
        }

        
        return players;
    }
}