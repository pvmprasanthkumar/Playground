//import required packages
import java.util.Scanner;
class Faculty
{  
  public void salary(int sal)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+ sal);
  }
}
class CSE extends Faculty
{
  public void salary(int sal)
  {
    //write your CSE class statements
    Faculty fac = new Faculty();
    fac.salary(sal);
    System.out.println("CSE Faculty: "+(sal+3000));
  }
}
class IT extends Faculty
{
  public void salary(int sal)
  {
    //write your IT class statements
    CSE cse = new CSE();
    cse.salary(sal);
    System.out.println("IT Faculty: "+(sal+5000));
  }
}
class ECE extends Faculty
{
  public void salary(int sal)
  {
    //write your ECE class statements
    IT it = new IT();
    it.salary(sal);
    System.out.println("ECE Faculty: "+(sal+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int sal = in.nextInt();
    ECE obj = new ECE();    
    //implement your required concept here
    obj.salary(sal);
  }
}