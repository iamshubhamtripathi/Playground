#include<stdio.h>
int main()
{
  int a=0,n;
  scanf("%d",&n);
  printf("Enter n value\n");
  printf("%d",a);
  int c,i;
  for(i=1;i<n;i++) {
    c=a+1+2*i;
    printf(" %d",c);
    a=c;
  }
}