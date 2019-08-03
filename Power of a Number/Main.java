#include <stdio.h>
#include<math.h>
int main()
{
  	//Your code here   
  int b,exp,po;
  scanf("%d%d",&b,&exp);
  if(exp<0)
  {
    printf("Wrong input");
  }
  else 
  {
    po = pow(b,exp);
    printf("%d",po);
  }
  
    return 0;
}