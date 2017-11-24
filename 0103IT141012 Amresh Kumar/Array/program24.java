import java.util.*;

public class program24
{
public static void main(String args[])
{
int arr[]={100,20,59,35,26,56,57,58,59,60,61,200,63,64,65};
int temp;
for(int i=0;i<15;i++)
{
for(int j=0;j<15-i-1;j++)
{
if(arr[j]>arr[j+1])
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
System.out.println("the greatest two numbers are "+arr[14]+", "+arr[13]);
System.out.println("the greatest two numbers are "+arr[0]+", "+arr[1]);
}
}

