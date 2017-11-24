import java.util.*;
public class program22
{
public static void main(String args[])
{
System.out.println("first 5 values which are divisible by 2, 3, and 5 are:-");
int temp;
int i=0;
for(int j=0;j<5;j++)
{
temp=0;
while(true)
{
	if(i%2==0 && i%3==0 && i%5==0 )
	{
//System.out.println(j+" "+i);
		temp=1;
++i;
		break;
	}
++i;
}
if(temp==1)
System.out.println("          "+(i-1));
}
}
}	
