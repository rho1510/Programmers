import java.util.*;

class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        char[] arr = number.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            sum+=Character.getNumericValue(arr[i]);
        }
        System.out.println(sum);
        answer = sum % 9;
        
        return answer;
    }
}