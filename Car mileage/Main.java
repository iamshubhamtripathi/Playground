#include<stdio.h>
int main()
{
  float mileage;
  int petrol_lit,destination;
  scanf("%f",&mileage);
  scanf("%d%d",&petrol_lit,&destination);
  if(((mileage*petrol_lit)-destination)>=0)
  {
    printf("Can reach");
  }
  else {
    printf("Cannot reach");
  }
}