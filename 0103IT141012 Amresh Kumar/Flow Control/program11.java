import java.util.*;
public class program11
{
public static void main(String args[])
{
try{
char a=args[0].charAt(0);
int x=a;
if(65<=x||x<= 90 || 97 <= x||x <= 122)
System.out.println("this is alphabet");
else if(48 < x||x < 57)
System.out.println("this is integer");
else
System.out.println("this is special charactor");
}
catch(Exception e)
{
System.out.println("this is special charactor");
}
}
}

