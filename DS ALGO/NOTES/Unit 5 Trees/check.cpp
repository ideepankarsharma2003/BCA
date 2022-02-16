#include<stdio.h>

int fun(int a, int b)

{

    if (b == 1)

        return a;

    else

        return a + fun(a, b - 1);
}

int main(){printf("%d\n", fun(2, 3));}