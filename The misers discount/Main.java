#include<stdio.h>
int main()
{
  float item1,item2;
  float discount;
  scanf("%f%f%f",&item1,&item2,&discount);
  float total_amount,discounted_price,amount_saved;
  discounted_price=((item1-(item1*discount)/100)+(item2-(item2*discount)/100));
  amount_saved=(item1+item2)-discounted_price;
  total_amount=amount_saved+discounted_price;
  printf("%.2f\n%.2f\n%.2f",total_amount,discounted_price,amount_saved);
}
  
