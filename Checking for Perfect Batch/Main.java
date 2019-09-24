import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for (int idx = 0; idx < n; idx++)
    {
      list[idx] = in.nextInt();      
    }
    int check = list[0] + list[1] + list[2];
    int same = list[3] + list[4] + list[5];
    if (check == same)
    {
      System.out.print("Perfect Batch");
    }
    else
    {
      System.out.print("Not a Perfect Batch");
    }
  }
}