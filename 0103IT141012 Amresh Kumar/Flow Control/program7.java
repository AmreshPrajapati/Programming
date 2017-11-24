
public class program7 {
public static void main(String args[])
{
	int a=Integer.parseInt(args[0]);
	switch(a)
	{
		case 1:
		System.out.println("red");
		break;
		case 2:
		System.out.println("black");
		break;
		case 3:
		System.out.println("white");
	break;
	default :
		System.out.println("no color found");
	}
}
}