#include <stdio.h>

void func(int n)
{
    int sum = 0;
    int i, j;
    int product = 1;
    for ( i = 0; i < n; i++)
    {
        for ( j = i; j < n; j++)
        {
            printf("%d , %d\n", i, j);
        }
    }
}

int main()
{
    func(4);
    return 0;
}