import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner (System.in);
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder(str);
    StringBuilder result = new StringBuilder("");
    int str_len = str.length();
    for (int i = 0; i < str_len; i++)
    {
      if ((sb.charAt(i)=='a')||(sb.charAt(i)=='e')||(sb.charAt(i)=='i')||(sb.charAt(i)=='o')||(sb.charAt(i)=='u'))
      {
        char ch = sb.charAt(i+1);
        result.append(ch);
        i++;
      }
      else
      {
        result.append(sb.charAt(i));
      }
    }
    System.out.print(result);
  }
}