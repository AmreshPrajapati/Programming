import java.util.*;
public class program14
{
public static void main(String args[])
{
char ch=args[0].charAt(0);
switch(ch)
{
case 'B':case 'b': System.out.println("the color is Blue");	
			break;
case 'R':case 'r': System.out.println("the color is Red");	
			break;
case 'O':case 'o': System.out.println("the color is Orange");	
			break;
case 'Y':case 'y': System.out.println("the color is Yellow");	
			break;
case 'W':case 'w': System.out.println("the color is White");	
			break;
case 'G':case 'g': System.out.println("the color is Green");	
			break;
default: System.out.println("invalid code");
			break;
}
}
}

