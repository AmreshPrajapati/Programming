#include<stdio.h>
#include<stdlib.h>

void merge_sort(int arr[],int n)
{
	int m,i;
	m=n/2;
	int l=(int)malloc(sizeof(m*int));
	int r=(int)malloc(sizeof((n-m)*int));
	for(i=0;i<m;i++)
	{
		l[i]=arr[i];
	}
	for(i=m;i<n;i++)
	{
		l[i-m]=arr[i];
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
	merge_sort(arr,n);
	printf("\nAfter:-  ");
	for(i=0;i<n;i++)
	{

		printf("%d ",arr[i]);
	}
	printf("\n");
}
