import java.util.Scanner;
public class project1 
{
public static void main(String args[])
{
int temp=0;
	String[][] det={{"1001","Amresh","01/04/2009","d","RED","20000","8000","3000"},
			        {"1002","manish","23/08/2012","c","PM","30000","12000","9000"},
			        {"1003","gagan","12/11/2008","k","acct","10000","8000","1000"},
			        {"1004","Rosy","13/09/2016","r","Front desk","12000","6000","2000"},
			        {"1005","pawan","16/07/2005","m","Engg","50000","20000","20000"},
			        {"1006","Ashish","01/01/2000","e","PM","23000","9000","4400"}};
	String[][] des={{"e","Enginner","20000"},
			        {"c","Consultant","32000"},
			        {"k","Clerk","12000"},
			        {"r","reception","15000"},
			        {"m","Enginner","14000"},
			        {"d","enginner","18000"}};
System.out.println("------------------------------------------------------------------------");
System.out.println("                            DETAILS ARE-  ");
System.out.println("------------------------------------------------------------------------");
for(int i=0;i<5;i++)
{
	if(args[0].equals(det[i][0]))
	{

		System.out.println("Emp no | Emp Name | Department | Designation | Salary ");
		int salary=Integer.parseInt(det[i][5]) + Integer.parseInt(det[i][6]) - Integer.parseInt(det[i][7]) + Integer.parseInt(des[i][2]);
	    System.out.println("  "+det[i][0]+"     "+det[i][1]+"      "+det[i][4]+"        "+des[i][1]+"    "+salary);
	temp=1;	
	break;
	}
	
	

	}
if(temp==0)
System.out.println("There is no employee with empid "+args[0]);
}
	}
	
