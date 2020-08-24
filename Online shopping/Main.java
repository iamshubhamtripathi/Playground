#include<stdio.h>
int main()
{
  int fshirt,fdis,fship,sdshirt,sddis,sdship,ashirt,adis,aship;
  scanf("%d%d%d%d%d%d%d%d%d",&fshirt,&fdis,&fship,&sdshirt,&sddis,&sdship,&ashirt,&adis,&aship);
  int flipkart,snapdeal,amazon;
  flipkart=((fshirt-(fshirt*fdis)/100)+fship);
  printf("In Flipkart: Rs.%d\n",flipkart);
  snapdeal=((sdshirt-(sdshirt*sddis)/100)+sdship);
  printf("In Snapdeal: Rs.%d\n",snapdeal);
  amazon=((ashirt-(ashirt*adis)/100)+aship);
  printf("In Amazon: Rs.%d\n",amazon);
  if(flipkart<snapdeal) {
    printf("He will prefer Flipkart");
  }
  else if(snapdeal<amazon) {
    printf("He will prefer Snapdeal");
  }
  else {
    printf("He will prefer Amazon");
  }
}