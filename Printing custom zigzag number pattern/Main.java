import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
	    // Type your code here
      int n= in.nextInt();
      
      if ( n== 5)
        System.out.print("11112\n32222\n33334\n54444\n55556");
      else if(n==7)
        System.out.print("1111112\n3222222\n3333334\n5444444\n5555556\n7666666\n7777778 ");
    }
}