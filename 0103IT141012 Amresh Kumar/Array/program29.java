import java.util.*;

public class program29
{
public static void main(String args[])
{
int arr[]={100,6,20,20,26,57,57,58,7,60};
int n=Integer.parseInt(args[0]);
int d=-1;
for(int i=0;i<10;i++)
{
if(n==arr[i])
d=i;
}

System.out.println("Array elements are ");
for(int i=0;i<10;i++)
{
System.out.print(arr[i]+" ");
}
System.out.println("\nthe search element is "+n+" and the index is "+d);
}
}

