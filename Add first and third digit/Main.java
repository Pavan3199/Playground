#include<stdio.h>
int main()
{
  //Type your code here
  int num,div,mod,sum;
  scanf("%d",&num);
  div = num/100;
  mod = num%10;
  sum = (div+mod);
  printf("%d",sum);
  return 0;
}