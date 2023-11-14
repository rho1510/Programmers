class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oNum = "";
        String eNum = "";
        
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==1){
                oNum+=num_list[i];
            }
            else{
                eNum+=num_list[i];
            }
        }
        
        answer = Integer.parseInt(oNum) + Integer.parseInt(eNum);
        
        return answer;
    }
}