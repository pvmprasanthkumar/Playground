import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String arr[] = str.split(" ");
    int len = arr.length;    
    for (int i = 0; i < len; i++)
    {      
      if (arr[i] != "null")
      {
        for (int j = i+1; j < len; j++)
        {
          if (arr[i].equals(arr[j]))
          {
          arr[j] = "null"; 
          }
        }      
      }
    }
    for (int i = 0 ; i < len; i++)
    {
      if (arr[i] != "null")
      {
        System.out.print(arr[i]+" ");
      }
    }
  }
}