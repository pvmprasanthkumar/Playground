import java.util.Scanner;
public class Main{   
   public static int great(int a, int b)
  {
     int perusu;
    if (a>b)
    {
      perusu =a;
    }
    else
    {
      perusu =b;
    }
    return perusu;
  }
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m = in.nextInt();
      int o = in. nextInt();
      int third = great(n,m);
      int fina = great(third,o);
        System.out.print(fina);
}
}