#include<stdio.h>
int main()
{
  float r,h,water,hr;
  scanf("%f%f%f%f",&r,&h,&water,&hr);
  if((3.4*r*r*h)*1000<=water*hr*1000)
  {
    printf("The tank can be filled within %.1f hours",hr);
  }
  else {
    printf("The tank cannot be filled within %.1f hours",hr);
  }
}