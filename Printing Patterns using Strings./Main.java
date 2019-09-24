import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int len = str.length();    
    for (int row = 0; row < len; row++)
    {
      for (int space = 1; space < len-row; space++)
      {
        System.out.print(" ");
      }
      int start = len/2;
        for (int col = 0; col <= row; col++)
        {          
          System.out.print(str.charAt(start));
          start++;
          if (start >= len)
          {
            start = 0;
          }
        }
      System.out.println();      
    }
  }
}