#include <stddef.h>
#include <stdio.h>
​
int stray(size_t n, const int arr[n]) {
int res = 0;
for(int i = 0; i < n; i++){
    res ^= arr[i];
}
    return res;
}