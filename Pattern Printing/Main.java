import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in = new Scanner(System.in);
      int row = in.nextInt();
      int col = in.nextInt();
      int var = col;
      for (int i = 1; i<=row; i++)
      {
        for (int j = row; j > row-i; j-- )
        {
          System.out.print(j);
        }
        for (int j = 1; j <= row-i; j++)
        {
          System.out.print(var);
        }
        System.out.println();
        var--;
      }
    }
}