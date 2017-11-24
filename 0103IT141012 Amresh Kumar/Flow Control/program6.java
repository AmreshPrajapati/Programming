public class program6 {
public static void main(String args[])
{
	try
	{
	int l=args.length;
	if(l==0)
		System.out.println("no value");
else{
	for(int i=0;i<l;i++)
		System.out.print(args[i]+", ");
}
	//if(args[0]=="NULL")
		System.out.println();
	
	}
	catch(Exception e)
	{
		System.out.println("no value");
	}

}
}
