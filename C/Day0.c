#include <stdio.h>


int main(int argc, char const *argv[])
{
    char input[105];

    scanf("%[^\n]", input);

    printf("Hello world.\n");

    printf("%s", input);

    return 0;
}