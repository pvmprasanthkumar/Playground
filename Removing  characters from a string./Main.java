import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String str1 = in.nextLine();
    StringBuilder sb = new StringBuilder(str);
    StringBuilder sb1 = new StringBuilder(str1);
    int len = str.length();
    int len1 = str1.length();
    for (int i = 0; i < len1; i++)
    {
      for (int j = 0; j < len; j++)
      {
        if (sb1.charAt(i) == sb.charAt(j))
        {
          for (int k = j; k < len-1; k++)
          {
            sb.setCharAt(k,sb.charAt(k+1));            
          }
          len--;
        }
      }
    }
    String result = sb.substring(0,len);
    System.out.print(result);
  }
}