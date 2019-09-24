import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int cmp[] = new int[n];
    int k =0;
    int max =0;   
    int arr[] = new int[n];
    for (int i = 0; i < n; i++)
    {
      arr[i] = in.nextInt();
    }    
    int seq[] = new int [n*2];
    int z = 0;
    int count = 0; 
    for (int i = 0; i < n-1; i++)
    {
      if (arr[i] > arr[i+1])
      {
        seq[z] = count;
        z++;
        seq[z] = i;
        z++;
        count = i+1;
      }
    }
    if (count != n-1)
    {
      seq[z] = count;
      z++;
      seq[z] = n-1;
      z++;
    }
    if (count == n-1)
    {
      seq[z] = count;
      z++;
      seq[z]= n-1;
      z++;
    }
    for (int i = 0; i <= z-1; i=i+2)
    {      
      int start_idx = seq[i];
      int end_idx = seq[i+1];
      int sum = 0;      
      for (int j= start_idx; j<=end_idx; j++)
      {
        sum = sum + arr[j];        
      }
      cmp[k] = sum;      
      k++;      
    }
    if (cmp[0] < cmp[1])
      {
        max = cmp[1];
      }
      else
      {
        max = cmp[0];
      }    
    for (int i =2; i < z-1; i++)
    {
      if (max < cmp[i])
      {
        max = cmp[i];
      }
      else
      {
        max = max;
      }      
    }
    System.out.print(max);
  }
}