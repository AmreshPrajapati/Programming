#include<stdio.h>

void insertion_sort(int arr[], int n)
{
	int i,temp,hole;
	for(i=1;i<n;i++)
	{
		temp=arr[i];
		hole=i;
		while(hole>0 && arr[hole-1]>temp)
		{
			arr[hole]=arr[hole-1];
			hole--;
		}
		arr[hole]=temp;
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
	insertion_sort(arr,n);
	printf("\nAfter:-  ");
	for(i=0;i<n;i++)
	{

		printf("%d ",arr[i]);
	}
	printf("\n");
}
