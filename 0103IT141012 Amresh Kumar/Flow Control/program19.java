import java.util.*;
public class program19
{
public static void main(String args[])
{
System.out.println("The prime numbers between 10 to 100 are:- ");
int n=10;
int temp;;
for(int j=n;j<=100;j++)
{
temp=0;
for(int i=2;i<j;i++)
{
	if(j%i==0)
	{
//System.out.println(j+" "+i);
		temp=1;
		break;
	}
}
if(temp==0)
System.out.println("          |"+j+"|");
}
}
}	
