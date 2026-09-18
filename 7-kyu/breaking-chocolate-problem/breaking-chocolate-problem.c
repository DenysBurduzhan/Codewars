#include <stdint.h>
​
uint32_t breaking_chocolate(uint32_t n, uint32_t m) {
    return n && m ? n * m - 1 : 0;
}