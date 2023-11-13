import java.util.*;

class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        char[] arr = code.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
           if(mode==0){
               if(arr[i]!='1'){
                   if(i%2==0){
                       answer+=arr[i];
                       continue;
                   }
               }
               else{
                   mode=1;
                   continue;
               }
           }
            else{
                if(arr[i]!='1'){
                    if(i%2==1){
                        answer+=arr[i];
                        continue;
                    }
                }
                else{
                    mode=0;
                }
            }
        }
        
        if(answer==""){
            return "EMPTY";
        }
        
        
        return answer;
    }
}