import java.util.Scanner;
class Main
{
  public static int power(int a , int b)
    {
      int count = 1;
    int num =1;
      while (count <= b)
      {        
        num =num*a; 
        count++;
      }
      return num;
    }
  public static void main (String[] args)
  {
    Scanner in = new Scanner(System.in);
    int adila = in.nextInt();
    int exp = in.nextInt();
    int base = power(adila,exp);
    System.out.print(base);
  }
}