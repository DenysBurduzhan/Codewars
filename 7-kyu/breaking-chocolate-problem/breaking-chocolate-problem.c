#include <stdint.h>
​
uint32_t breaking_chocolate(uint32_t n, uint32_t m) {
    if((n < 1 || m < 1) || (n == 1 && m == 1)){
        return 0;
    }
    return n * m -1;
}