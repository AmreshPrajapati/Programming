import java.util.*;

public class program27 
{
public static void main(String args[])
{
int arr[]={100,20,20,20,26,57,57,58,59,60};
int count=0,temp,m=0;
for(int i=0;i<10;i++)
{
temp=0;
for(int j=0;j<9-i;j++)
{
if(arr[i]==arr[j])
{
	++temp;
}
if(temp>=count)
{
count=temp;
m=i;
}
}
}


for(int i=0;i<10;i++)
{
System.out.print(arr[i]+" ");
}
System.out.println("\n                "+arr[m]);
}
}

