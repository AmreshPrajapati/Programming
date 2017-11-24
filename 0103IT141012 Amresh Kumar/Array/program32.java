import java.util.*;

class program32
{
 
 public static void main(String arg[])

 { 

 int i;
 int j;
Scanner sn=new Scanner(System.in);
System.out.println("array value");
int n=sn.nextInt();
int arr[]=new int[n];

	for(i=0;i<n;i++)
	{
	arr[i]=sn.nextInt();
	}
insorted(arr);
System.out.println("");
System.out.println("bubble array sorted");
for(j=0;j<arr.length;j++ )
{
	System.out.print(arr[j]+" ");
}

 }

private static void insorted(int[] sortedout)
{
	int t=sortedout.length;
	int temp=0;
	for(int j=0;j<t;j++)
	{	for(int k=1;k<(t-j);k++)
		{
			if(sortedout[k-1]>sortedout[k])
			{
				temp=sortedout[k-1];
				sortedout[k-1]=sortedout[k];
				sortedout[k]=temp;
			}
		}		
    }

 }
}
