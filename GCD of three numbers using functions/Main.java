import java.util.Scanner;
public class Main{
  public static int hcf(int a, int b)
  {
    int min =0;
    int gcd =0;
    if(a<b)
    {
      min=a;
    }
    else
    {
      min=b;
    }
    while(min>=1)
    {
      if((a%min==0)&&(b%min==0))
      {
        gcd = min;
        break;
      }
      min--;
    }
    return gcd;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int first = hcf(n1,n2);
      int last = hcf(first,n3);
      System.out.print(last);
	}
}