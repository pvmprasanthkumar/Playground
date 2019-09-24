import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    int len = n/2;
    for (int i = 0; i < n; i++)
    {
      arr[i] = in.nextInt();
    }
    for(int i = 1; i < len; i++)
    {
      for (int j = i; j > 0; j--)
      {
        if (arr[j] < arr[j-1])
        {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;        
        }        
      }
    }
    for(int i = len+1; i < n; i++)
    {
      for (int j = i; j > len; j--)
      {
        if (arr[j] > arr[j-1])
        {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;        
        }        
      }
    }
    for (int i = 0; i < n; i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}