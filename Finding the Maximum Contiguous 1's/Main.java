import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
    Scanner in = new Scanner(System.in);    
    int n = in.nextInt();
    int arr[] = new int[n];
      int count = 1;
    for (int i = 0; i < n; i++)
    {
      arr[i] = in.nextInt();
    }
      for (int i = 0; i < n-1; i++)
      {
        if (arr[i] == 1 && arr[i+1] == 1)
        {
          count++;
        }
      }
      System.out.print(count);
    }
}
