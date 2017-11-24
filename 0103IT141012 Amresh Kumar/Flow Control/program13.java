import java.util.*;
public class program13
{
public static void main(String args[])
{
char ch=args[0].charAt(0);
int n=ch;
if(n>=65 && n<=90 )
{
System.out.println(ch+" -> "+(char)(n+32));
}
else if(n>=97 && n<=122 )
{
System.out.println(ch+" -> "+(char)(n-32));
}
else
System.out.println("invalid character");
}
}
