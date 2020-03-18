#include<stdio.h>
#include<string.h>
void main(){
  int i=0,j=0,k=0,p,n,a,b;
   scanf("%d",&n);
   a=n-3;
   b=(n-3)/2;
   printf("*");
   for(i=0;i<b;i++)
   printf(" ");
   printf("*");
   for(i=0;i<b;i++)
   printf("*");
   printf("*\n");
   
   for(i=0;i<b;i++){
       printf("*");
   for(j=0;j<b;j++)
   printf(" ");
     printf("*");
   for(j=0;j<b;j++) // it prints the whitw space 
   printf(" ");
   printf(" \n");
   }
   for(i=0;i<n;i++)
   printf("*");
   printf("\n");
   for(i=0;i<b;i++){
       printf(" ");
   for(j=0;j<b;j++)
   printf(" ");
     printf("*");
   for(j=0;j<b;j++)
   printf(" ");
   printf("*\n");
   }
   printf("*");
   for(i=0;i<b;i++)
   printf("*");
   printf("*");
   for(i=0;i<b;i++)
   printf(" ");
   printf("*\n");
}
