public class program35 {
	public static void main(String args[])
	{
		int c;
		int d;
int k=0;
int g=0;
	//	int arg=Integer.parseInt(args[0]);
		int matrix[][] = new int[3][3];
		 for ( c = 0 ; c < 3 ; c++ )
	         for ( d = 0 ; d < 3 ; d++ )
	         {
	            matrix[c][d] = Integer.parseInt(args[k]);;
	            k++;
	         }
	        //int[][] reverse = new int[2][2];
	        for(int i = 0; i < 3; i++) {
	            for(int j = 0; j <3; j++) 
		{
		if(matrix[i][j]>g)
		{
			g=matrix[i][j];
		}	
        }
	        }
	for(int i = 0; i< 3; i++) 
	{
	            for(int j = 0; j <3; j++) 
		{
	            System.out.print(matrix[i][j]+"  ");
		}
System.out.println();	
	}	
	       
	            System.out.println("the greatest number in the matrix is "+g);
	        }
	}	

