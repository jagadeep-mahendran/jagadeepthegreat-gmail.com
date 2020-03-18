#include<stdio.h>
void main(){
  int i,j,k,n;
  scanf("%d",&n);
  int p=n,x=2,q=1;
for(i=n;i>0;i--)
 {    
     for(j=n;j>=i;j--)
            printf("%d ",j);
     for(k=2*j-1;k>0;k--)
           printf("%d ",j+1);
      for(j=p;j<=n;j++){
            if(j!=1)
            printf("%d ",j);
            }
            p--;
      printf("\n");
     }

for(i=n;i>1;i--)
 {    
         for(j=n;j>=x;j--)
              printf("%d ",j);
           for(j=0;j<q;j++)
                    printf("%d ",x);
             for(j=x;j<=n;j++)
                 printf("%d ",j);
         q=q+2;
       x++;
      printf("\n");
     }    
  }
