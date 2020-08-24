#include<stdio.h>
int main()
{
  int no_goldcoin,ben_share_per,blackbeard_share_per;
  scanf("%d%d%d",&no_goldcoin,&ben_share_per,&blackbeard_share_per);
  int ben_share,blackbeard_share,other_pirates_share;
  ben_share=(no_goldcoin*ben_share_per)/100;  // x% share of Total_Treasure_Gold_coins 
  blackbeard_share=((no_goldcoin-ben_share)*blackbeard_share_per)/100; //y% share of remaining Total_share_gold_coins
  other_pirates_share=(no_goldcoin-(ben_share+blackbeard_share))/3; //other pirates(3) will share the remaining gold coins equally.
  printf("%d\n%d\n%d",ben_share,blackbeard_share,other_pirates_share);
  
  
}