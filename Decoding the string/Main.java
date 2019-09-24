import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int key = in.nextInt();
    key = 26-key;
    int len = str.length();
    for (int i = 0; i < len; i++)
    {
      char ch = sb.charAt(i);
      if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
      {
        int offset = ch-'A';
        offset = (offset+key)%26;
        ch = (char) (offset+'A');
      }
      else if (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z')
      {
        int offset = ch-'a';
        offset = (offset+key)%26;
        ch = (char) (offset+'a');
      }
      sb.setCharAt(i,ch);
    }
    System.out.print(sb);
  }
}