import java.util.*;

public class program28 
{
public static void main(String args[])
{
int arr[]={100,6,20,20,26,57,57,58,7,60};
int sum=0,sum2=0,l=0,m=0;
for(int i=0;i<10;i++)
{
sum=sum+arr[i];
if(arr[i]==6)
l=i;
else if(arr[i]==7)
{
	if(l<i)
	m=i;
}
}
for(int i=l;i<=m;i++)
{
sum2=sum2+arr[i];
}


for(int i=0;i<10;i++)
{
System.out.print(arr[i]+" ");
}
System.out.println("\n                "+(sum-sum2));
}
}

