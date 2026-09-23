#include <stdio.h>
​
​
int sumTriangularNumbers(int n)
{
    if (n <= 0) {
      return 0;
    }
    int sum = 0;
    while(n != 0){
        sum += n *(n +1) / 2;
        n--;
    }
  return sum;
}