import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String words[] = str.split(" ");
    StringBuilder sb = new StringBuilder(str);
    int words_len = words.length;
    StringBuilder sep[] = new StringBuilder[words_len];
    for (int i=0; i < words_len; i++)
    {
      sep[i] = new StringBuilder (words[i]);
      sep[i].reverse();
      System.out.print(sep[i]+" ");
    }
  }
}