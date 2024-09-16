import java.util.*;
public class Solution {
    static String greaterParitySubpart(String s) {
        // Write your code here.
        Scanner sc=new Scanner(System.in);
        int l= sc.nextInt();
        String S= sc.next();
        int t=S.length();
       // String p[]=new String[t];
       String []p=S.split();
        
        for(int i=0;i<t;i++)
        {
            if(i%2==0)
            {
                System.out.print(p[i]);
            }
        }
        
    }
}
