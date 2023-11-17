import java.util.*;

class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        long wcnt = control.chars().filter(c->c=='w').count();
        long acnt = control.chars().filter(c->c=='a').count();
        long scnt = control.chars().filter(c->c=='s').count();
        long dcnt = control.chars().filter(c->c=='d').count();
        
        answer = (int)(n + wcnt - scnt + (10 * dcnt) - (10 * acnt));
        
        return answer;
    }
}