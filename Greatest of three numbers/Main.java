import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code her
      Scanner i=new Scanner (System.in);
      int a=i.nextInt();
      int b=i.nextInt();
      int c=i.nextInt();
      if(a>b&&a>c)
        System.out.print(a);
        else if(b>a&&b>c)
          System.out.print(b);
          else 
            System.out.print(c);
           
    }
}
