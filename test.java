import java.util.*;

public class test
{
public static void main(String args[])
{
int k;
int c=31;
int d=123;
for(int i=0;i<32;i++)
{
k=c<<d;
if(k & 1)
System.out.print("1");
else
System.out.print("0");

c--;
}
}
}
