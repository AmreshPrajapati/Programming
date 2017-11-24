import java.util.*;
public class program21 {
public static void main(String args[])
{
	int temp=0,sum=0;
	Scanner sn=new Scanner(System.in);
System.out.println("Enter a number here:- ");	
	int n=sn.nextInt();
	int x=n;
	while(x>0)
	{
		
		temp=x%10;
		x=x/10;
		sum=sum+temp;
		
		
	}
	System.out.println(n+" -> "+sum);
	
}
}
