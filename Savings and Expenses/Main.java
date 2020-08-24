#include<stdio.h>
int main()
{
  int salary,amount_topay_bank,hostel_fees,food_expense,amount_sendto_parents;
  scanf("%d%d%d%d%d",&salary,&amount_topay_bank,&hostel_fees,&food_expense,&amount_sendto_parents);
  if(salary>=amount_topay_bank+hostel_fees+food_expense+amount_sendto_parents) {
    printf("He can save the money");
  }
  else {
    printf("He has to work hard");
  }
}