import java.util.Scanner;
class Main
{  
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int i = 1;
    int res = sum(n,i);
    System.out.print(res);
  }
  public static int sum(int n, int i)
  {
   if (i == n)
    {
      return n;
    }
    else
    {
      return i+(sum(n,(i+1)));
    }
  }
}