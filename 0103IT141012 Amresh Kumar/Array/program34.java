public class program34 {
	public static void main(String args[])
	{
		int c;
		int d;
int k=0;
	//	int arg=Integer.parseInt(args[0]);
		int matrix[][] = new int[2][2];
		 for ( c = 0 ; c < 2 ; c++ )
	         for ( d = 0 ; d < 2 ; d++ )
	         {
	            matrix[c][d] = Integer.parseInt(args[k]);;
	            k++;
	         }
	        int[][] reverse = new int[2][2];
	        for(int i = 2-1; i >= 0; i--) {
	            for(int j = 2-1; j >= 0; j--) {
	                reverse[2-1-i][2-1-j] = matrix[i][j];
	            }
	        }
	        for(int i = 0; i < 2; i++) {
	            for(int j = 0; j < 2; j++) {
	                System.out.print(reverse[i][j]);
	                if(j < 2-1)
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	}	
}
