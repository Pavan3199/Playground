#include<stdio.h>
int main()
{
  float r,ang,arc,pi=3.14;
  scanf("%f%f",&r,&ang);
  arc = 2*3.14*r*(ang/360);
  printf("%.2f",arc);


}