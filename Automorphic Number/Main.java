#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n<0 && n>9) {
    printf("Invalid Imput");
    //Checking Automorphic Number for 1 digit
  }
  if(((n*n) % 10) == n) {
    printf("Automorphic Number");
  }
  else {
    printf("Not Automorphic Number");
  }
}