class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String sum1 = Integer.toString(a)+Integer.toString(b);
        
         if(Integer.parseInt(sum1)>2*a*b){
            answer=Integer.parseInt(sum1);
        }
        else{
            answer=2*a*b;
        }
        
        return answer;
    }
}