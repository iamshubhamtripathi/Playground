#include<stdio.h>
int main()
{
  int a=2,n;
  scanf("%d",&n);
  printf("%d",a);
  int c,i;
  for(i=2;i<=n;i++) {
    c=(((a+1)*2)-i);
    a=c;
    printf(" %d",c);
  }
}