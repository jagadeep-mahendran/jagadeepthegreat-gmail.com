import java.util.*;
class Test{
	
    //driver code 
    public static void main (String[] args) 
    { 
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int i,j,sum=0,sm=0,f=0;
       int a[][]=new int[n][n];
       for(i=0;i<n;i++)
               for(j=0;j<n;j++)
          	 a[i][j]=sc.nextInt();
          	 for(i=0;i<n;i++){
               for(j=0;j<n;j++){
          	
          	      System.out.print(a[i][j]+" ");
          	      }
          	       System.out.println();
          	 }
          	 
           for(i=0;i<n;i++){
               for(j=0;j<n;j++){
          	 if(i==j){
          	      sum=sum+a[i][j];
          	     // System.out.println(a[i][j]);
          	      }
          	 }
          	 }
          	//  System.out.println(sum);
           for(i=0;i<n;i++)
              {   sm=0;
                   for(j=0;j<n;j++)
                        {
                        sm=sm+a[i][j];
                        }
                        if(sm!=sum){
                            f=1;
                            break;
                            }
              }
             // System.out.println(sm);
            for(i=0;i<n;i++)
              {   sm=0;
                   for(j=0;j<n;j++)
                        {
                        sm=sm+a[j][i];
                        }
                        if(sm!=sum){
                            f=1;
                            break;
                            }
              }
             //  System.out.println(sm);
              sm=0;
              for(i=n-1,j=0;(i>=0&j<n);i--,j++)
                  {
                       sm=sm+a[i][j];
                  }
                  if(sm!=sum)
                      f=1;
                  //     System.out.println(sm);
                      if(f==0)
                          System.out.println("Magic Square");
                          else
                          System.out.println("Not a Magic Square");
    } 
}
