import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      
        // Type your code here
      int s=in.nextInt();
      int arr[]=new  int[s] ;
      int a=arr[0];
      for(int i=0;i<s;i++)
      {
        arr[i]=in.nextInt();
        if(a<arr[i])
        
          a=arr[i];
        
      }
      System.out.print(a);
    }
}
      