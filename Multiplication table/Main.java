#include<stdio.h>
int main()
{
  int n,l,i;
  scanf("%d%d",&n,&l);
  for(i=1;i<=l;i++) {
    printf("%d * %d = %d\n",n,i,n*i);
  }
}