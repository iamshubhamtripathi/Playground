#include<stdio.h>
int main()
{
  int p,r,t;
  float i,a,d,final;
  scanf("%d%d%d",&p,&r,&t);
  i=(p*r*t)/100;
  a=p+i;
  d=(i*2)/100;
  final=a-d;
  printf("%.2f\n%.2f\n%.2f\n%.2f",i,a,d,final);
}