import java.util.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(int i=0;i<a.length();i++){
            char x = a.charAt(i);
            
            if(Character.isUpperCase(x)){
                answer+=Character.toLowerCase(x);
            }
            else{
                answer+=Character.toUpperCase(x);
            }
        }
        System.out.println(answer);
    }
}