#include <stdio.h>

int main(int argc, char const *argv[])
{
    int i = 4;
    double d = 4.0;
    char s[] = "Hackerrank ";

    int j; 
    double k;
    char input[105]; 
    scanf("%d", &j);
    scanf("%lf", &k);
    scanf(" %[^\n]s", input);

    printf("%d\n", (i+j));
    printf("%.1lf\n", (d+k));
    printf("%s", s);
    printf("%s", input);

    return 0;
}
