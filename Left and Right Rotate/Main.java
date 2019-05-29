import java.util.Scanner;
class Main 
{
  public static void lree(int as,int arr[],int nor)
  {
    int feei=1;
    int leei;
    if(as % 2 ==0)
    {
      leei=as-1;
    }
    else
    {
      leei=as-2;
    }
    for(int r=1;r <= nor;r++)
    {
      int t=arr[feei];
      for(int i=3;i<as;i+=2)
      {
        arr[i-2]=arr[i];
      }
      arr[leei]=t;
    }
  }
  public static void rroe(int as,int arr[],int nor)
  {
    int foei=0;
    int loei;
    if(as %2 ==1)
    {
      loei=as-1;
    }
    else
    {
      loei=as-2;
    }
    for(int r=1;r <= nor;r++)
    {
      int t=arr[loei];
      for(int i=(loei-2);i >=0;i-=2)
      {
        arr[i+2]=arr[i];
      }
      arr[foei]=t;
    }
  }
  
  
  public static void main(String args[])
    {
    Scanner in = new Scanner(System.in);
    int as=in.nextInt();
    int arr[]=new int[as];
    for(int i=0;i <=(as-1);i++)
    {
      arr[i]=in.nextInt();
    }
    int nor=in.nextInt();
    lree(as,arr,nor);
    rroe(as,arr,nor);
    for(int i=0;i<=(as -1);i++)
    {
      System.out.print(arr[i]+" ");
    }
    	//Try your code here
  	}
}