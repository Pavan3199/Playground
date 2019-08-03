#include <stdio.h>
int main() {
	//Type your code
  int num,od;
  scanf("%d",&num);
  for(od=1;od<=num;od++)
  {
    if(od%2==1)
    {
    printf("%d\n",od);
    }
  }
	return 0;
}