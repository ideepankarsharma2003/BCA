#include <stdio.h>

int Bsearch(int arr[], int l, int r, int x)
{
    if (r >= l)
    {
        int mid = l + (r - l) / 2;

        if (arr[mid] == x)
            return mid;
        if (arr[mid] > x)
            return Bsearch(arr, l, mid - 1, x);
        return Bsearch(arr, mid + 1, r, x);
    }
    return -1;
}

int main()
{
    int n;
    int arr[1000000];
    int s;
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    scanf("%d", &n);
    printf("%d", Bsearch(arr, 0, n, s));
}