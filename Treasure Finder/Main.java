#include<stdio.h>
int main()
{
  int a,b,c;

 scanf("%d%d%d",&a,&b,&c);

 int sum=a+b+c;

 int gp=0,sp=0;

 //finding position of the largest number

 if(a>b && a>c)

  gp=a;

 else if(b>a && b>c)

  gp=b;

 else

  gp=c;

 //finding position of the smallest number

 if(a<b && a<c)

  sp=a;

 else if(b<a && b<c)

  sp=b;

 else

  sp=c;

int x=gp+sp;//adding the positon of largest and smallest number

int y=sum-x;//subustracting it from the positions total(1+2+3=6)
  if(y==a) {
     printf("The treasure is in the box which has number %d.",a);
     printf("The code to open the box is %d.",sp);
  }
  if(y==b) {
     printf("The treasure is in the box which has number %d.",b);
     printf("\nThe code to open the box is %d.",sp);
  }
  else {
     printf("The treasure is in the box which has number %d.",c);
     printf("\nThe code to open the box is %d.",sp);
  }



}