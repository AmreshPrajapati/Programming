#include<iostream>
using namespace std;

int main()
{
int a=5;

int b=a++ + ++a + a++;
cout<<b<<" "<<a<<"\n";
return 0;
}
