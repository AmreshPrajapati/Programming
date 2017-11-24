import java.util.*;
public class program12
{
public static void main(String args[])
{
char g=args[0].charAt(0);
int age=args[1].charAt(0);
if(g=='M' || g=='m')
{
	if(age>=1 && age<=60)
	{
		System.out.println("Interest is 9.2");
	}
	if(age>=61 && age<=120)
	{
		System.out.println("Interest is 8.3");
	}
}
if(g=='F' || g=='f')
{
	if(age>=1 && age<=58)
	{
		System.out.println("Interest is 9.2");
	}
	if(age>=59 && age<=120)
	{
		System.out.println("Interest is 8.3");
	}
}
}
}
