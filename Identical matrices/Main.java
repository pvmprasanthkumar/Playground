import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int mat1[][] = new int[r][c];
    int mat2[][] = new int[r][c];
    for (int i = 0; i < r; i++)
    {
      for (int j = 0; j < c; j++)
      {
        mat1[i][j]=in.nextInt();
      }
    }
    for (int i = 0; i < r; i++)
    {
      for (int j = 0; j < c; j++)
      {
        mat2[i][j]=in.nextInt();
      }
    }
    int count = 0;
    for (int i = 0; i < r; i++)
    {
      for (int j = 0; j < c; j++)
      {
        if (mat1[i][j] == mat2[i][j])
        {
          count++;
        }
      }
    }
    int con = r*c;
    if (count == con)
    {
      System.out.print("Yes");
    }
    else
    {
      System.out.print("No");
    }
  }
}