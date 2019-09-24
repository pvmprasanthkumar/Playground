import java.util.Scanner;
class Main{
  public static void sort_elem(int n, int arr[])
  {
    for (int i = 0; i < n-1; i++)
    {
      int min_idx = find_order(i,n-1,arr);      
      swap(i, min_idx,arr);
    }
  }
  public static int find_order(int start_idx, int end_idx, int arr[])
  {
   int mini_idx = 0;
    if (arr[start_idx] < arr[start_idx + 1])
    {
      mini_idx = start_idx;
    }
    else
    {
      mini_idx = start_idx + 1;
    }
    for (int i = start_idx + 2; i <= end_idx; i++)
    {
      if (arr[mini_idx] > arr[i])
      {
        mini_idx = i;
      }
    }
    return mini_idx;
  }
  public static void swap(int start_idx, int min_idx, int arr[])
  {
    int temp = arr[start_idx];
    arr[start_idx] = arr[min_idx];
    arr[min_idx] = temp;
  }
    public static void main(String args[])
    {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++)
      {
        arr[i] = in.nextInt();        
      }
      int k = in.nextInt();
      sort_elem(n, arr);            
      System.out.println(arr[n-k]);
    }   
}