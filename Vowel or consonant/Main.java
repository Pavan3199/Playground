#include<stdio.h>
int main()
{
  char let;
  scanf("%s",&let);
  if(let == 'a' || let == 'e' || let == 'i' || let == 'o' || let == 'u')
  {
    printf("Vowel");
  }
  else if(let == 'A' || let == 'E' || let == 'I' || let == 'O' || let == 'U')
  {
    printf("Vowel");
  }
  else
  {
    printf("Consonant");
  }
  return 0;
}