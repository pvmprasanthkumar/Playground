//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
}

class Bill
{
  //implement your logic to calculate total price
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String item = in.nextLine();
    int amount = in.nextInt();
    int qty = in.nextInt();
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    System.out.print("Total Price is : "+(amount*qty));
  }
}