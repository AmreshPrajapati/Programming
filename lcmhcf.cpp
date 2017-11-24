#include<iostream>
using namespace std;
int main()
{
	int x,y,a,b,temp;
	cout<<"enter two number here :-\n";
	cin>>x>>y;
	a=x;
	b=y;
	while(b>0)
	{
		temp=b;
		b=a%b;
		a=temp;

	}
	cout<<"\nHCF of these number is  :-"<<a;
	cout<<"\nLCM of these number is  :-"<<((x*y)/a)<<"\n";
	return 0;

}
