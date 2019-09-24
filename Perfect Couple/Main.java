import java.util.Scanner;
class Main{
  public static void sum_of(int n, int arr[], int value)
  {
    for(int i1 = 0; i1 < n; i1++)
    {
      for (int i2 = i1 + 1; i2 < n; i2++)
      {
        int sum = arr[i1] + arr[i2];
        if (sum == value)
        {
          System.out.println(arr[i1]+","+" "+arr[i2]);
        }
      }
    }
  }
    public static void main(String args[]) {
      // Type your code here      
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for (int idx = 0; idx < n; idx++)
      {
        arr[idx] = in.nextInt();
      }
      int value = in.nextInt();    
      sum_of(n, arr, value);
    }
}