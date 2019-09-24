import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for (int idx = 0; idx < n; idx++)
    {
      arr[idx] = in.nextInt();
    }
      for (int i = 0; i < n; i++ )
      {
        if (arr[i]>0)
        {
          System.out.print(arr[i] + " ");
        }        
      }
      for (int i = 0; i < n; i++)
      {
        if (arr[i] == 0)
        {
          System.out.print("0 ");
        }        
      }
    }
}