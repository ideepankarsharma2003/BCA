#include <graphics.h>
#include <iostream>
using namespace std;

// Midpoint Circle drawing Algorithm
void drawMidPointCircle(int x0, int y0, int radius)
{
    int x = radius, y = 0;
    int decisionParam = 1 - radius;

    while (y <= x)
    {
        putpixel(x0 + x, y0 + y, 1);
        putpixel(x0 - x, y0 + y, 2);
        putpixel(x0 + x, y0 - y, 3);
        putpixel(x0 - x, y0 - y, 4);
        putpixel(x0 + y, y0 + x, 5);
        putpixel(x0 - y, y0 + x, 6);
        putpixel(x0 + y, y0 - x, 7);
        putpixel(x0 - y, y0 - x, 8);

        y++;

        if (decisionParam <= 0)
            decisionParam += 2 * y + 1;
        else
        {
            x--;
            decisionParam += 2 * (y - x) + 1;
        }
    }
}

// Brensanham Circle drawing Algorithm

void drawBrensanhamCircle(int x0, int y0, int radius)
{
    int x = 0, y = radius;
    int decisionParam = 3 - 2 * radius;

    while (x <= y)
    {
        putpixel(x0 + x, y0 + y, RED);
        putpixel(x0 + y, y0 + x, RED);
        putpixel(x0 - y, y0 + x, RED);
        putpixel(x0 - x, y0 + y, RED);
        putpixel(x0 - x, y0 - y, RED);
        putpixel(x0 - y, y0 - x, RED);
        putpixel(x0 + y, y0 - x, RED);
        putpixel(x0 + x, y0 - y, RED);

        if (decisionParam <= 0)
        {
            x++;
            decisionParam += 4 * x + 6;
        }
        else
        {
            x++;
            y--;
            decisionParam += 4 * (x - y) + 10;
        }
    }
}

int main()
{
    int gDrive = DETECT;

    int gMode;

    initgraph(&gDrive, &gMode, NULL);

    int X0 = 0, Y0 = 0, radius = 0;

    printf("The constraint on the X-axis are(0-%d)\n", getmaxx());
    printf("The constraint on the Y-axis are(0-%d)\n", getmaxy());

    cout << ("Enter the X0: ");
    scanf("%d", &X0);
    cout << ("Enter the Y0: ");
    scanf("%d", &Y0);
    cout << ("Enter the radius: ");
    scanf("%d", &radius);

    // Function call
    // DDA(X0, Y0, X1, Y1);
    drawBrensanhamCircle(X0, Y0, radius);
    // DDA(2, 2, 14, 16);
    getch();
    closegraph();
    return 0;
}
