import java.util.Scanner;
class Main{
  
  public static int fun(int x,int y)
  {
    int min,g=1;;
    if(x<y)
      min=x;
    else
      min=y;
    while(min >0)
    {
      if(x % min == 0 && y % min ==0)
      {
         g=min;
        break;
      }
     min--;
    }
    return g;
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