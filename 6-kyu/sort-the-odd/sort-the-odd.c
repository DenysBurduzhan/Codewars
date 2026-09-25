#include <stdlib.h>
​
void sort_array(size_t n, int arr[n]) {
  for (long long i = 0; i < (long long)n - 1; ++i)
    for (unsigned long j = i + 1; j < n; ++j)
      if (arr[i] & 1 && arr[j] & 1 && arr[i] > arr[j])
      {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}