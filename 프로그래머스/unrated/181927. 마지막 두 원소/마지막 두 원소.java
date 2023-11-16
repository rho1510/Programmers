class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        
        int leng = num_list.length;
        
        for(int i=0;i<leng;i++){
            answer[i] = num_list[i];
        }
        
        if(num_list[leng-1]>num_list[leng-2]){
            answer[answer.length-1] = num_list[leng-1] - num_list[leng-2];
        }
        else{
            answer[answer.length-1] = num_list[leng-1] * 2;
        }
        
        return answer;
    }
}