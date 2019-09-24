import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int str_len = str.length();
      int arr[] = new int[26];
      for (int idx = 0; idx < 26; idx++)
      {
        arr[idx] = 0;
      }
      for (int i = 0; i < str_len; i++)
      {
        if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
        {
          int character = str.charAt(i) - 'a';
          arr[character]++;
        }
        else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
        {
          int character = str.charAt(i) - 'A';
          arr[character]++;
        }
      }
      for (int i = 0; i <26; i++)
      {
        if (arr[i] == 0)
        {
          char temp = (char) ('a'+ i);
          System.out.print(temp + " ");
        }
      }
    }
}