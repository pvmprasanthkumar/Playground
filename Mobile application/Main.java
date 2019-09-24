class MyModel1 {
     //write your logic here
  MyModel1()
  {
    System.out.println("Features of MyModel 1");
    System.out.println("Camera mega pixels: 2");    
  }
}
class MyModel2 extends MyModel1 {
     //write your logic here
  MyModel2()
  {
  System.out.println("Features of MyModel 2");
  System.out.println("Camera mega pixels: 5");    
  System.out.println("Lock mechanism: Fingerprint");    
  System.out.println("Display size: 5");      
}
}
class MyModel2T extends MyModel2 {
     //write your logic here
  MyModel2T()
  {
  System.out.println("Features of MyModel 2T");
  System.out.println("Camera mega pixels: 16");    
  System.out.println("Lock mechanism: Fingerprint");    
  System.out.println("Display size: 6");      
  }
}
public class Main 
{
    public static void main(String[] args) 
    {
          //write your logic here
      MyModel2T mod = new MyModel2T();
    }
}