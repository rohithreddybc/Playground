import java.util.*;
class Main
{
  public static int square(int m)
  {
   int s;
    s=m*m;
    return s;
  }
  public static void main(String args[])
  {
    //Try out your code here
    Scanner i=new Scanner(System.in);
    int n=i.nextInt();
    
    int n2;
    n2=square(n);
    System.out.print(n2);
    
    
  }
}