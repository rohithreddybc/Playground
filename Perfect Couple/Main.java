import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
       int arr[]=new int[a];
      for(int i=0;i<a;i++)
      {
        arr[i]=in.nextInt();
      }
      int v=in.nextInt();
      func(a,arr,v);
    }
  public static void func(int a,int arr[],int v)
  {
    
    for(int j=0;j<a;j++)
    {
      for(int k=j+1;k<a;k++)
      {
        if((arr[j]+arr[k])==v){
          System.out.println(arr[j]+", "+arr[k]);
        }
      }
      
    }
  }
}