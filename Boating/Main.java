#include<stdio.h>
int main()
{
  int weight_handle_by_boat,no_adult,no_child;
  scanf("%d%d%d",&weight_handle_by_boat,&no_adult,&no_child);
  // weight of children is 30
  // weight of adult is 75
  if(weight_handle_by_boat>=((30*no_child)+(75*no_adult))) {
    printf("Boat is stable");
  }
  else {
    printf("Boat will drow");
  }
  
}