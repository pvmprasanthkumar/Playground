import java.util.Scanner;
class Main{
  public static void delete_space(StringBuilder sb, int len)
  {
    StringBuilder temp = new StringBuilder("");
    for (int i = 0; i < len; i++)
    {
      if (sb.charAt(i) != ' ')
      {
        temp.append(sb.charAt(i));
      }
    }
    sb.setLength(0);
    int temp_len = temp.length();
    for (int i = 0; i < temp_len; i++)
    {
      sb.append(temp.charAt(i));
    }
  }
  public static void main(String args[]) 
  {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int col_count = in.nextInt();
    int len = str.length();
    StringBuilder sb = new StringBuilder(str);
    delete_space(sb,len);
    len = sb.length();
    if (len%col_count != 0)
    {
      int add = col_count-(len%col_count);
      for (int i = 0; i<add; i++)
      {
        sb.append('X');
      }      
    }
    len = sb.length();
    int row_count = len/col_count;
    for (int col =0; col < col_count; col++)
    {
      for (int row = 0; row < row_count; row++)
      {
        int currcharidx = col+(row*col_count);
        if (row%2==1)
        {
          int charidx = (col_count-1)+(row*col_count);
          currcharidx = charidx-col;
        }
        if (currcharidx<len)
        {
          System.out.print(sb.charAt(currcharidx));
        }
      }
    }
  }
}