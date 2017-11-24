import java.util.*;
public class program20
{
public static void main(String args[])
{

int n=Integer.parseInt(args[0]);
int temp=0;

for(int i=2;i<n;i++)
{	
	if(n%i==0)
	{
//System.out.println(j+" "+i);
		temp=1;
		break;
	}
}
if(n==0 || n==1)
{
	System.out.println(n+" is neither prime nor composite");
	temp=2;
}
if(temp==0)
System.out.println("Yes, "+n+" is a prime number");
else if(temp==1)
System.out.println("No, "+n+" is not a prime number");
}
}
	
