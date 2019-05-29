import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a=0,b=0;
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      if(a<arr[i])
      {
        a=arr[i];
      b=i;
    }}
    System.out.print(b);
    
  }
}