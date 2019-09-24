public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
      Customers cus1 = new Customers();
      Customers cus2 = new Customers();
      cus1.setDetails(1001,"Saakshi",9000000000L,"Bangalore","16-Jul-1990",'F',"Lakme Kajal,Salwar");
      cus2.setDetails(1008,"Rahul",9000000001L,"Chennai","27-Jan-1992",'M',"T-Shirt,Jeans");
      System.out.println(cus1.GetName() +", "+ cus1.GetNo());
      System.out.println(cus2.GetName() +", "+ cus2.GetNo());
      Suppliers sup1 = new Suppliers();
      Suppliers sup2 = new Suppliers();
      sup1.setSupp(7901,"ABC Traders",8000000000L,"Mumbai",10,"Paid",4.75f);
      sup2.setSupp(7972,"XYZ Enterprises",8000000900L,"Kolkata",7,"Unpaid",4.35f);
      System.out.println(sup1.SupName+", "+sup1.SupNo);
      System.out.println(sup2.SupName+", "+sup2.SupNo);
      cus1.editAddress("Coimbatore");
      sup1.editAddress("Delhi");
      cus1.placeOrder();
      sup1.increase(5);
      sup2.increase(10);
    }	
}

class Users {  
		//write the logic for the class Users    
}

class Customers extends Users{
		//write the logic for the class Customers	
  int CusId;
  String CusName;
  long CusNo;
  String ShipAddress;
  String DOB;
  char Gender;
  String History;
  public void setDetails(int id, String name, long no, String address, String date, char gender, String orders)
  {
    this.CusId = id;
    this.CusName = name;
    this.CusNo = no;
    this.ShipAddress = address;
    this.DOB=date;
    this.Gender = gender;
    this.History = orders;
  }
  public String GetName()
  {
    return CusName;
  }
  public long GetNo()
  {
    return CusNo;
  }
  public void editAddress(String address)
  {
    System.out.println(CusName+", "+ShipAddress);
    System.out.println(CusName+", "+address);
  }
  public void placeOrder()
  {
    System.out.println("Order placed successfully!");
  }
}
class Suppliers extends Users {
		//write the logic for the class Suppliers
  int SupId;
  String SupName;
  long SupNo;
  String BillAddress;
  int Stock;
  String Payment;
  float Feedback;
  public void setSupp(int id, String name, long no, String address, int sto, String pay, float feed)
  {
    this.SupId = id;
    this.SupName  =name;  
    this.SupNo = no;
    this.BillAddress= address;
    this.Stock = sto;
    this.Payment = pay;
    this.Feedback = feed;
  }
  public void editAddress(String Address)
  {
    System.out.println(SupName+", "+BillAddress);
    System.out.println(SupName+", "+Address);
  }
  public void increase(int add)
  {
    System.out.println(SupName+", "+(this.Stock+add));
  }  
}