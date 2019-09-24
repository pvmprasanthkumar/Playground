import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
    int num =0;
    for(int i=1; i<=n; i++)
    {
      num = num+i;
    }
    return num;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int addition = sum(n);
      System.out.print(addition);
	}
}