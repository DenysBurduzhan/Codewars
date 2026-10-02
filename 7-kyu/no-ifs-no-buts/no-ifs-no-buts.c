#include <stdio.h>
#include <string.h>
​
void noIfsNoButs(char comp_string[64], int a, int b)
{
    const char *relation[] = {
        " is equal to ",
        " is greater than ",
        " is smaller than "
    };
    int index = (a > b) * 1 + (a < b) * 2;
​
    sprintf(comp_string, "%d%s%d", a, relation[index], b);
}