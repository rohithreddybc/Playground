import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      
      Scanner in=new Scanner(System.in);
      int s=in.nextInt();
      
      int arr[]=new int[s];
      
      for(int i=0;i<s;i++)
      {
        arr[i]=in.nextInt();
      }
      fun(s,arr);
           
}
 public static void fun(int s,int arr[]){
              int c=0;         
  for(int i=0;i<s;i++)
  {
    if(arr[i]!=0)
    {
      arr[c++]=arr[i];
    }
  }
    while(c<s)
      arr[c++]=0;
  for(int i=0;i<s;i++){
      System.out.print(arr[i]+" ");
      }
   
              }
}