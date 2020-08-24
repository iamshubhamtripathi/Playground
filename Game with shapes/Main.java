#include<stdio.h>
int main()
{
  int r,l,d;
  scanf("%d%d",&r,&l);
  d=2*r;
  if(l==d) {
    printf("circle can be inside a square");}
  else {
    printf("circle cannot be inside a Square");}
}