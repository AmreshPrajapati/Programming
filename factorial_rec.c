#include<stdio.h>
int fact(int);
int main()
{
int n,x,i,f=1;
printf("Enter a Number:-\n");
scanf("%d",&n);
x=fact(n);
printf("%d\n",x);
return 0;
}

int fact(int n)
{
if (n>=1)
	return n*fact(n-1);
else 
	return 1;
}
