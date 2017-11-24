import java.util.*;

class program31
{
public static void main(String arg[])
{ int i;
int max,min;
Scanner sn=new Scanner(System.in);
System.out.println("array value");
int n=sn.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
	arr[i]=sn.nextInt();
}
max=maxout(arr);
System.out.println("maximum value is "+max );
min=minout(arr);
System.out.println("minimum value is "+min);
}
public static int maxout(int []arrout)
{
	int arrmax=arrout[0];
	for(int j=0;j<arrout.length;j++)
	{	if(arrout[j]>arrmax)
		{
			arrmax=arrout[j];
			
		}
	}
	return arrmax;
}
public static int minout(int [] arrout)
{
	int arrmin=arrout[0];
	for(int j=0;j<arrout.length;j++)
	{if(arrout[j]<arrmin)
		{
			arrmin=arrout[j];
		}
	}
	return arrmin;
}

}
