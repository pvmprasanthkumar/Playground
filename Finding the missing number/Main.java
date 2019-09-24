import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here      
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int elem[] = new int[n];
      for (int i = 0; i < n; i++)
      {
        elem[i] = in.nextInt();
      }
      int arr[] = new int[n+1];
      for (int i = 1; i <= n; i++)
      {
        arr[i] = 0;
      }
      for (int i = 0; i < n; i++)
      {        
          arr[elem[i]]++;        
      }
      for (int i = 1; i <= n; i++)
      {
        if (arr[i] == 0)
        {
          System.out.print(i);
        }
      }
    }
}