import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
	    // Type your code here
      int n= in.nextInt();
      
      for (int i=1;i<=n;i++)
      {
        
       if( i==1 || i == n)
       {
        for (int j=1;j<=n;j++)
        {
         System.out.print("*"); 
        }
         
       }
         else
            for (int k=1;k<=n;k++)
      {
              if(k==1 || k == n){
                System.out.print("*");}
              else {
                System.out.print(" ");}
           
       }
        System.out.print("\n");
      }
      
      
	}
}