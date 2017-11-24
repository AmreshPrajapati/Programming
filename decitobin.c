#include<stdio.h>

int main()
{
int i,n,x;
printf("Enter the in decimal form\n");
scanf("%d",&n);
printf("The number in binary is \n");
for(i=31;i>=0;i--)
{
x=n>>i;
if(x & 1)
printf("1");
else
printf("0");
}
printf("\n");
return 0;
}
