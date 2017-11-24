import java.util.*;
public class program9 {
public static void main(String args[])
{
	int temp=0;
	Scanner sn=new Scanner(System.in);
	int n=sn.nextInt();
	int x=n;
	while(x>0)
	{
		
		temp=x%10;
		x=x/10;
		
		System.out.print(temp);
		
	}
	
	
}
}