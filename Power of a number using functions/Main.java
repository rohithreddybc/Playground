
import java.util.*;
class Main{
  
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
	    // Type your code here
      int b= in.nextInt(); 
      int e= in.nextInt(); 
      
      int ans=sq(b,e);
      System.out.print(ans);
    }

      
      public static int sq(int base,int exponent)
      {
        int r=1;
        while(exponent !=0){
       r=r*base;
          --exponent;
        }
        return r;
        
      }
      
}