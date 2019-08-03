#include<stdio.h>
int main()
{
  //Type your code here
  int num,digit;
  scanf("%d",&num);
  digit = (num%100)/10;
  printf("%d",digit);
  return 0;
}