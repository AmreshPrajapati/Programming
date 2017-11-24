#include<stdio.h>
float sqt(int);
int main()
{
int n;
float res;
printf("Enter the Number Here:-\n");
scanf("%d",&n);
res=sqt(n);
printf("\nthe square root of %d is %f\n",n,res);
return 0;
}

float sqt(int x)
{
float a=0,b=x,n=0;
while(a<b)
{
n=(a+b)/2;
if(n*n==x)
break;
else if((n*n)>x)
{
a=0;
b=n;
}
else
{
a=n;
b=x;
}
printf("a=%f,b=%f,n=%f,x=%d\n",a,b,n,x);
}
return n;
}
