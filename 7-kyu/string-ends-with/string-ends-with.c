#include <stdbool.h>
#include <string.h>
​
bool solution(const char *string, const char *ending) {
    size_t len_str = strlen(string);
    size_t len_end = strlen(ending);
​
    if (len_end > len_str) return false;
    if (len_end == 0) return true;
​
    return strcmp(string + len_str - len_end, ending) == 0;
}
​