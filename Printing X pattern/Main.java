import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
	    // Type your code here
      int n= in.nextInt();
      
      for (int i=1;i<=n;i++)
      {
        for (int j=1;j<=n;j++){
          if(i==j || j==(n+1)-i)
          {
            System.out.print("*");
          }
        else
          System.out.print(" ");}
        System.out.print("\n");
      }
         
	}
}