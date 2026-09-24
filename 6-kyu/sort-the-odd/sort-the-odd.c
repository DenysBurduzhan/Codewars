#include <stdlib.h>
​
void sort_array(size_t n, int arr[n]) {
    int odd[n];
    size_t oddSize = 0;
​
    for (size_t i = 0; i < n; i++)
        if (arr[i] % 2 != 0)
            odd[oddSize++] = arr[i];
 
   if (oddSize > 1) {
    for (size_t i = 0; i < oddSize - 1; i++) {
        for (size_t j = 0; j < oddSize - i - 1; j++) {
            if (odd[j] > odd[j + 1]) {
                int tmp = odd[j];
                odd[j] = odd[j + 1];
                odd[j + 1] = tmp;
            }
        }
    }
}
​
​
    size_t oddIndex = 0;
    for (size_t i = 0; i < n; i++)
        if (arr[i] % 2 != 0)
            arr[i] = odd[oddIndex++];
}
​