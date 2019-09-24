import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    int lar = 0;
    int index = 0;
    for (int idx = 0; idx < n; idx++)
    {
      list[idx] = in.nextInt();      
    }
    if (list[0] > list[1])
    {
      lar = list[0];
    }
    else 
    {
      lar = list[1];
    }    
    for (int i = 2; i < n; i++)
    {
      if (lar < list[i])
      {
        lar = list[i];
        index = i;
      }     
    }
    System.out.print(index);
  }
}