#include<stdio.h>

int main()
{
int n,x,i,f=1;
printf("Enter a Number:-\n");
scanf("%d",&n);
x=n;
while(x>0)
{
f=f*x;
--x;
}
printf("the factorial of %d is %d\n",n,f);
return 0;
}
