#include<stdio.h>
int main()
{
  int n,i,a=1;
  scanf("%d",&n);
  printf("Enter n value\n");
  printf("%d",a);
  for(i=2;i<=n;i++) {
    a=pow(i,i);
    printf(" %d",a);
  }
}