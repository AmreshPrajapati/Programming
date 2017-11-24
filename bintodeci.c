#include<stdio.h>

int main()
{
long int n,x,d=0,rem=0,base=1;
printf("Enter a number in binary form\n");
scanf("%ld",&n);
x=n;
while(x>0)
{
rem=x%10;
if(rem>1)
{
printf("The number %ld is not a binary number !! sorry\n",n);
return 0;
}
x=x/10;
}

printf("The number %ld in decimal is \n",n);
x=n;
while(x>0)
{
rem=x%10;
d=d+base*rem;
base=base*2;
x=x/10;
}
printf("%ld\n",d);
return 0;
}
