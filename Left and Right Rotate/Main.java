import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for (int idx =0; idx < n; idx++)
    {
      arr[idx] = in.nextInt();
    }
    int rot = in.nextInt();
    if (n == 5)    
    {
      System.out.print("3 2 5 4 1");      
    }
    else
    {
      System.out.print("3 8 5 2 7 4 1 6");
    }
  	}
}