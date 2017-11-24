import java.util.*;

public class program26
{
public static void main(String args[])
{
int arr[]={100,20,20,35,26,57,57,58,59,60};
int temp=0;
for(int i=0;i<9;i++)
{
if(arr[i]==arr[i+1])
{
++temp;
}
}
for(int i=0;i<9;i++)
{
if(arr[i]==arr[i+1])
{
for(int j=i;j<9;j++)
{
arr[j]=arr[j+1];
}
}
}

for(int i=0;i<10-temp;i++)
{
System.out.println(arr[i]);
}
}
}

