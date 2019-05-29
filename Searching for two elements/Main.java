import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      
        // Type your code here
      int s=in.nextInt();
      int arr[]=new  int[s] ;
      for(int i=0;i<s;i++)
      {
        arr[i]=in.nextInt();
        
      }
        
      int p1=0,p2=0,q1=0,q2=0;
  int e1=in.nextInt();

      int e2=in.nextInt();
      
      for(int j=0;j<s;j++)
      {
       if(e1==arr[j])
       {
        p1=1;
         q1=j;
         
       }
        if(e2==arr[j])
       {
        p2=1;
         q2=j;
       }
}
      if(p1!=0)
        System.out.println(q1);
      else
        System.out.println(-1);
      if(p2!=0)
        System.out.println(q2);
      else
        System.out.println(-1);
    
   }
}