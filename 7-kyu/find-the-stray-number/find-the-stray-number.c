#include <stdio.h>
#include <stddef.h>
​
int stray(size_t n, const int arr[n]) {
    int result = 0;
    for (size_t i = 0; i < n; i++) {
        result ^= arr[i];
    }
    return result;
}