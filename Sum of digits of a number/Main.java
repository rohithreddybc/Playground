import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
      int t=0;
      while ( n>0)
      {
        t=t+(n%10);
        n=n/10;
      }
  
    System.out.println(t);
  }
}