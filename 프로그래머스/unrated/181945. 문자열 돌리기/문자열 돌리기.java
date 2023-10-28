import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] arr = a.toCharArray();
        
        for(int i=0;i<a.length();i++){
            System.out.println(arr[i]);
        }
    }
}