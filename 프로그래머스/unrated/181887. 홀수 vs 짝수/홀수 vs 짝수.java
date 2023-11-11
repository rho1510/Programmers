class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int osum = 0;
        int esum = 0;
        
        for(int i=0;i<num_list.length;i++){
            if(i % 2 == 0){
                osum += num_list[i];        
            }
            else{
                esum += num_list[i];
            }
        }
        
        if(osum >= esum){
            answer = osum;
        }
        else
            answer = esum;
        
        return answer;
    }
}