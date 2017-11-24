#include<iostream>

using namespace std;
int bin(int);
int main()
{
cout<<bin(10);
return 0;
}


int bin(int n)
{
if(n==0)
return(0);
else if(n==1)
return(1);
else
return(bin(n-1)+bin(n-2));
}
