import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {        
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] mat = new int[r][c];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                mat[i][j] = in.nextInt();
            }
        }
      int i,j;
        for(int k = 0; k < c; k++)
        {
  	        for(i = 0,j = k; j < c ; i++, j++)
    	    System.out.print(mat[i][j]+" ");
        }        
    }    
}