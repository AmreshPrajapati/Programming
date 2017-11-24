#include<stdio.h>
//#include<conio.h>

int main()
{
int n,i,j,temp,flag;
printf("\nEnter size of array:- ");
scanf("%d",&n);
int arr[n];
printf("\nEnter Element in the array \n");
for(i=0;i<n;i++)
scanf("%d",&arr[i]);
for(i=0;i<n;i++)
{
	flag=0;
	for(j=0;j<n-i-1;j++)
	{
		if(arr[j]>arr[j+1])
		{
		flag=1;
		temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
		}
	}
	if(flag==0)
	break;	

}
printf("\n--------------sorted list is---------------------\n");
for(i=0;i<n;i++)
printf("%d  ",arr[i]);
printf("\n----------------------------------------------------\n");
return 0;
}
