#include <stdio.h>
int main() {
	char le;
    int val;
    scanf("%c",&le);
    val = (int)le;
    if(val>=97)
    {
      val = val-32;
      le = (char)val;
      printf("%c",le);
    }
    else
    {
      val = val+32;
      le = (char)val;
      printf("%c",le);
    }
	return 0;
}