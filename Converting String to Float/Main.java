import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int len = str.length();
    double afterdec = 0, befdec = 0;
    int flag = 0;
    for (int i = 0; i < len; i++)
    {
      if (str.charAt(i) == '.')
      {
        flag = 1;
      }
    }
    if (flag == 1)
    {
      for (int i = len - 1; (i >= 0) && (str.charAt(i) != '.'); i--)
      {
        afterdec = afterdec/10 + (str.charAt(i) - '0');
      }
      afterdec = afterdec/10;
      for (int i = 0; str.charAt(i) != '.'; i++)
      {
        befdec = befdec*10 + (str.charAt(i) - '0');
      }
    }
    else
    {
      for (int i = 0; i<len; i++)
      {
        befdec = befdec*10 + (str.charAt(i) - '0');        
      }
    }
    double sum = afterdec+befdec;
    System.out.printf("%.6f",sum);
  }
}
