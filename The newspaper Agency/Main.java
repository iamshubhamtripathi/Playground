#include<stdio.h>
int main()
{
  int w,x,y;
  int profit;
  scanf("%d%d%d",&w,&x,&y);
  profit=w*x-(100+w*y);
  printf("%d",profit);
}