class boolservice
{
int n;
void check(boolean b[])
{
while(n<950)
{
	
	for(int i=0;i<1000;i++)
	{
		if(b[i]==true)
		{
		n=i;
		b[i]=false;
		break;
		}
	}
System.out.print(n+", ");
	for(int i=n;i<1000;i++)
	{
		if(i%n==0)
		{ 
		b[i]=false;
		}
	}
}
}
}
