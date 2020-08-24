#include<stdio.h>
int main()
{
  int row,column,tree;
  scanf("%d%d%d",&row,&column,&tree);
  if(row*2 == tree || row*(column-1) == tree) {
    printf("It is a mango tree");
  }
  else {
    printf("It is not a mango tree");
  }
}										