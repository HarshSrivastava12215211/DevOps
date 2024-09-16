import java.util.*;
public class Solu {
	public static long evenSumTillN(int t,int n) {
	Scanner sc=new Scanner(System.in);
	//int t=sc.nextInt();
        int sum=0;
        for(int j=0;j<t;j++){
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
        
	}
	return sum;
}
}