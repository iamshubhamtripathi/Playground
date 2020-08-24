#include<stdio.h>
int main()
{
  int a=0,n,i,c;
  scanf("%d",&n);
  printf("Enter n value\n");
  printf("%d",a);
  for(i=1;i<n;i++) {
    c=a+2*i;
    printf(" %d",c);
    a=c;
  }
  
}