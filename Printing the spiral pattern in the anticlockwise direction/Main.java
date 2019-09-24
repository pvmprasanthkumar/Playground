import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      int  n = in.nextInt();
      int mat[][] = new int[n][n];
      int val = 1;
      int rmin = 0;
      int rmax=n-1;
      int cmin = 0;
      int cmax=n-1;
      while ((rmax >= rmin) && (cmax >= cmin))
      {
      for (int i= rmax; i >= rmin; i--)
      {
        mat[rmin][i]=val++;        
      }
      for (int i = cmin+1; i <= cmax; i++)
      {
        mat[i][cmin]=val++;
      }
      for (int i = rmin+1; i <=rmax;i++)
      {
        mat[rmax][i]=val++;
      }
      for (int i = cmax-1; i>=cmin+1;i--)
      {
        mat[i][cmax]=val++;
      }
      rmax--;
      rmin++;
      cmax--;
      cmin++;
    }
      for (int i = 0;i <n;i++)
      {
        for (int j =0; j < n; j++)
        {
          System.out.print(mat[i][j]+" ");
        }
        System.out.println();
      }      
    }
}