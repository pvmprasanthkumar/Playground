import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int res = fact(n);
    System.out.print(res);
  }
  public static int fact(int n)
  {
    if (n == 0)
    {
      return 1;
    }
    else
    {
      return n*(fact(n-1));
    }
  }
}