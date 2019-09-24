import java.util.Scanner;
class Main{
  public static int great(int a , int b)
  {
    int big =0;
    if (a>b)
    {
      big = a;
    }
    else
    {
      big = b;
    }
    return big;
  }
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for (int idx = 0; idx < arr_size; idx++)
      {
        arr[idx] = in.nextInt();
      }      
      int n1 = great(arr[0],arr[1]);
      int n2 = great(arr[2],arr[3]);
      int n3 = great(n1,n2);
      int n4 = great(n3,arr[4]);
      System.out.print(n4);
    }
}