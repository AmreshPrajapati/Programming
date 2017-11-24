#include<stdio.h>

void selection_sort(int arr[],int n)
{
	int i,j,min,temp;
	for(i=0;i<n;i++)
	{
		min=i;
		for(j=i;j<n;j++)
		{
			if(arr[min]>arr[j])
			{
				min=j;
			}
		}
		temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
	}
}

int main()
{
	int i,n=10;
	int arr[]={12,99,55,89,43,3,78,46,60,38};
	printf("Before:-  ");
	for(i=0;i<n;i++)
	{

		printf("%d ",arr[i]);
	}
	selection_sort(arr,n);
	printf("\nAfter:-  ");
	for(i=0;i<n;i++)
	{

		printf("%d ",arr[i]);
	}
	printf("\n");
}
