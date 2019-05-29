import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int k=1;
      for(int r=1;r<=n;r++){
        for(int s=1; s<=(n-(r)); s++){
          System.out.print(" ");
        }
        for(int c=1; c<=k ; c++ ){
        System.out.print("*");
        }
          k=k+2;
      
      System.out.print("\n");
	}
}
}