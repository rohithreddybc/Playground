import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    //System.out.println("Hello World!");
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int arr[]=new int[a];
    for(int i=0;i<a;i++)
    {
      arr[i]=in.nextInt();
    }
   fun(a,arr);
   
  }
  public static void fun(int a,int arr[])
  {
 for(int i=0;i<a;i++)
 {
   for(int j=i+1;j<a;j++)
   {
     for(int k=j+1;k<a;k++)
     {
       System.out.print("("+arr[i]+", "+arr[j]+", "+arr[k]+") ");
     }
   }
   if(i<a-1)
   {
   System.out.println();
 }
 }
    
}
}