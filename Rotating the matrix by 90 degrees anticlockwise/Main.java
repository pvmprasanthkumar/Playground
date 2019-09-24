import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int mat[][] = new int[r][c];
    for (int i = 0; i < r; i++)
    {
      for (int j = 0; j < c; j++)
      {
        mat[i][j]=in.nextInt();
      }
    }
    for (int i = r-1; i >=0; i--)
    {
      for (int j = 0; j < c; j++)
      {
        System.out.print(mat[j][i]+" ");
      }
      System.out.println();
    }
  }
}