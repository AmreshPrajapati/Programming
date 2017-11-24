import java.util.*;

class program30
{
public static void main(String arg[])
{ int i;
int temp=0;
Scanner sn=new Scanner(System.in);
System.out.println("array value");
int n=sn.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
	arr[i]=sn.nextInt();
	temp+=arr[i];
	
}
float avg=temp/n;

System.out.println("sum= "+temp+" "+"average="+avg);

}
}
