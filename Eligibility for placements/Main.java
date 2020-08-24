#include <stdio.h>
int main()
{

  int register_no,arrears;
  float cgpa;
  char name[10];
  scanf("%s%d%f%d",&name,&register_no,&cgpa,&arrears);
  if(arrears==0 && cgpa>=7.0){
    printf("%s\n",name);
    printf("%d\n",register_no);
    printf("Eligible to attend placement");
  }
  else if(( arrears == 1 || arrears ==2) && cgpa>=7.5) {
    printf("%s\n",name);
    printf("%d\n",register_no);
    printf("Eligible to attend placement");
  }
  else
  {
    printf("%s\n",name);
    printf("%d\n",register_no);
    printf("Not Eligible to attend placement");
  }

}