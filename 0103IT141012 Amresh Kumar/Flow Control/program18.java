import java.util.*;
public class program18
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Please Enter a number here:- ");
int n=s.nextInt();
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
if(temp==0)
System.out.println("Yes, "+n+" is a prime number");
else
System.out.println("No, "+n+" is not a prime number");
}
}
	
