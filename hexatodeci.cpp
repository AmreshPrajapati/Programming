#include<iostream>
#include<string.h>
#include<stdlib.h>
#include"stdio.h"
#include<math.h>

using namespace std;
int main()
{
	int deci,t;
	char ch, str[20];
	cout<<"Enter any hexadecimal value :-\n";
	gets(str);
	cout<<pow(8,2);
	for(int i=0;str[i]!='\0';i++)
	{
		if((str[i]>54 && str[i]<71) || (str[i]>96 && str[i]<103) || (str[i]>47 && str[i]<58  ))
		{
			cout<<str[i];
		}
		else
		{
			cout<<"\n It is not a hexadecimal value";
			break;
		}
	}
		cout<<"\n";
	
	return 0;
}
