#include<stdio.h>
#include<math.h>
int main()
{
  int x1=3,y1=4,x2,y2;
  scanf("%d%d",&x2,&y2);
  int x,y,a,z;
  //Distance formula AB=sqrt(((x2-x1)^2)+(y2-y1)^2);
  x=pow((x2-x1),2);
  y=pow((y2-y1),2);
  z=x+y;
  a=sqrt(z);
  printf("%d",a);
}