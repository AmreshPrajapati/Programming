import java.util.*;

public class ASCII
{
public static void main(String args[])
{

Scanner s=new Scanner(System.in);
System.out.println("choose 1 or 2 :-\n1)ASCII to char\n2)char to ASCII");
int n=s.nextInt();
if(n==1)
a2c();
else if(n==2)
c2a();
else
System.out.println("your choice is wronge");
}
public static void c2a()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a Charactor here  :-");

char ch=s.next().charAt(0);
int i=(int)ch;
System.out.println("The ASCII code of "+ch+" is "+i);
}
public static void a2c()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a ASCII Code here  :-");
int x=s.nextInt();
char ch=(char)x;
System.out.println("The charactor of this "+x+" is "+ch);
}
}
