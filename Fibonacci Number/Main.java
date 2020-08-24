#include<stdio.h>
#include<math.h>
int main()
{
  int n,a,b,x,y;
  scanf("%d",&n);
  x=5*pow(n,2)+4;
  y=5*pow(n,2)-4;
  a=(int)sqrt(5*pow(n,2)+4);
  b=(int)sqrt(5*pow(n,2)-4);
  if(x==a*a || y==b*b) {
printf("Fibonacci Number");
  }
    else {
printf("Not Fibonacci Number");
    }
  }
