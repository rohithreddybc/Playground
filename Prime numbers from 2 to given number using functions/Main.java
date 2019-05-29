import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int m=in.nextInt();
      int flag;
      for(int i=2;i<=m;i++){
      flag=prime(i);
  if(flag == 1)
            System.out.println(i);
    }
   // return 0;
}



public static int prime(int n)
{
    int j, flag = 1;

    for(j=2; j <= (n/2); ++j)
    {
        if (n%j == 0)
        {
            flag =0;
            break;
        }
    }
    return flag;
}
}