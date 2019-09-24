import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exp = in.nextInt();
      int track = 1;
      int res=1;
      while (track <= exp)
      {
        res = res*base;
        track++;
      }
      System.out.print(res);
    }
}