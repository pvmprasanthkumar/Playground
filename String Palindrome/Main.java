import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int str_len = str.length();
      int front = 0;
      int end = str_len-1;
      boolean pal = false;
      while (front < end)
      {
        if (str.charAt(front) == str.charAt(end))
        {
          pal = true;          
        }
        front++;
        end--;
      }
      if (pal == true)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    } 
}