import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int sd;
	    
	    
	    while (n > 100)
	    {
	        n/=10;
	        
	    }
	    
	    sd=n%10;
	    System.out.println(sd);
	   /* sd=n;
	    while ( sd >= 10){
	        
	        sd/=10;
	    }
		System.out.println(sd);*/
	}
}