import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      int sec_las_Dig = (n%100)/10;
	  System.out.println(sec_las_Dig);
	}
}