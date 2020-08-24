#include<stdio.h>
int main()
{
  int wall_l,wallb,p1l,p1b,p2l,p2b;
  scanf("%d%d%d%d%d%d",&wall_l,&wallb,&p1l,&p1b,&p2l,&p2b);
  if(2*((wall_l*wallb))>=(2*(p1l*p1b)+2*(p2l*p2b))) {
    printf("Raj can fix both painting");
  }
  else {
    printf("Raj cannot fix both painting");
  }
}