import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = n;
      for (int row = 1; row <= n; row++)
      {
        for (int col =num; col >=1 ; col--)
        {
          System.out.print(col);          
        }
        System.out.println();
        num = num - 1;
      }
	}
}