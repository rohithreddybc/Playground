import java.util.Scanner;
class Main{
  
  public static int fun(int x,int y)
  {
    int max,g=1;;
    if(x<y)
      
      max=y;
    else
      max=x;
    return max;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1= in.nextInt();
      int n2= in.nextInt();
      int n3= in.nextInt();
      int n4,a;
      n4=fun(n1,n2);
      a=fun(n3,n4);
      System.out.print(a);
      
	}
}