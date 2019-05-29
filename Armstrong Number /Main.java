/*import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
	   int n1,t,dig=0,t3=0,ln;
    t=n;
    while (t > 0)
    {
      t=t/10;
      dig++;
	}
    int t2=n;
    while ( t2 >0)
    {
       ln=t2%10;
      t3=t3+(ln^dig);
      t2--;
    }
      System.out.println(t3);
      if (t3==n)
        System.out.println("Armstrong Number");
    else
      System.out.println("Not Armstrong Number");
      
    }
}*/


import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int t,n1,s=0;
    n1=n;
    while ( n1 != 0)
    {
      t=n1%10;
      s=s+(t*t*t);
      n1/=10;
    }
    
    if (s==n)
     System.out.println("Armstrong Number");
    else
      System.out.println("Not a Armstrong Number");
    
  }
}
    