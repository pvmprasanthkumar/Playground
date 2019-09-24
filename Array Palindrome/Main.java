import java.util.Scanner;
class Main{
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
      int front = 0; 
      int end = n-1;
      boolean check = true;
      while (front < end)
      {
        if (arr[front] == arr[end])
        {
          check = true;
        }
        else
        {
          check = false;
        }
        front++;
        end--;
      }
      if (check == true)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    }
}