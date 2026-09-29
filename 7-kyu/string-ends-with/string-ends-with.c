#include <stdbool.h>
​
#include <stdbool.h>
#include <string.h>
​
bool solution(const char *string, const char *ending) {
  const size_t lenString = strlen(string), lenEnding = strlen(ending);
  return lenEnding <= lenString && strcmp(string + (lenString - lenEnding), ending) == 0;
}