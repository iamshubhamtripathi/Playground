#include<stdio.h>
int main()
{
  int road_a,road_b,road_c,no_of_cars;
  scanf("%d%d%d%d%d",&road_a,&road_b,&road_c,&no_of_cars);
  if((road_a%no_of_cars) == 0) {
    printf("Car 1 goes into road A");
  }
  else if((road_b%no_of_cars) == 0) {
    printf("Car 1 goes into road B");
  }
  else if((road_c%no_of_cars) == 0) {
    printf("Car 1 goes into road C");
  }
  else {
    printf("No path exist");
  }
}