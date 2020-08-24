#include<stdio.h>
int main()
{
  char item[20];
  int available_stock,amount_of_one_item,no_of_item_asked;
  scanf("%s",item);
  scanf("%d%d%d",&available_stock,&amount_of_one_item,&no_of_item_asked);
  if(available_stock>=no_of_item_asked) {
    printf("The amount for %d pencil is %d",no_of_item_asked,no_of_item_asked*amount_of_one_item);
    printf("Remaining number of pencils present in the stock:%d",available_stock-no_of_item_asked);
  }
  else {
    printf("Out of stock");
  }
}