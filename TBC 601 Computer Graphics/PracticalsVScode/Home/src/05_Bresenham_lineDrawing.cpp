
#include <graphics.h>
#include <math.h>
#include <stdio.h>
int abs(int n) { return ((n > 0) ? n : (n * (-1))); }

// DDA Function for line generation
void DDA(int X0, int Y0, int X1, int Y1)
{
    // calculate dx & dy
    int dx = X1 - X0;
    int dy = Y1 - Y0;

    // calculate steps required for generating pixels
    int steps = abs(dx) > abs(dy) ? abs(dx) : abs(dy);

    // calculate increment in x & y for each steps
    float Xinc = dx / (float)steps;
    float Yinc = dy / (float)steps;

    // Put pixel for each step
    float X = X0;
    float Y = Y0;
    for (int i = 0; i <= steps; i++)
    {
        putpixel(round(X), round(Y),
                 RED); // put pixel at (X,Y)
        X += Xinc;     // increment in x at each step
        Y += Yinc;     // increment in y at each step
        delay(100);    // for visualization of line-
                       // generation step by step
    }
}

void bresenham(int x1, int y1, int x2, int y2)
{
    int dx = abs(x2 - x1);
    int dy = abs(y2 - y1);
    int sx = x1 < x2 ? 1 : -1;
    int sy = y1 < y2 ? 1 : -1;
    int err = dx - dy;

    while (x1 != x2 || y1 != y2)
    {
        putpixel(x1, y1, WHITE);
        int e2 = 2 * err;
        if (e2 > -dy)
        {
            err -= dy;
            x1 += sx;
        }
        if (e2 < dx)
        {
            err += dx;
            y1 += sy;
        }
        delay(100);
    }
    putpixel(x1, y1, WHITE); // plot the final point
}

int main()
{
    int gDrive = DETECT;

    int gMode;

    initgraph(&gDrive, &gMode, NULL);

    int X0 = 0, Y0 = 0, X1 = 0, Y1 = 0;

    printf("The constraint on the X-axis are(0-%d)\n", getmaxx());
    printf("The constraint on the Y-axis are(0-%d)\n", getmaxy());

    printf("Enter the X0:\t");
    scanf("%d", &X0);
    printf("Enter the Y0:\t");
    scanf("%d", &Y0);
    printf("Enter the X1:\t");
    scanf("%d", &X1);
    printf("Enter the Y1:\t");
    scanf("%d", &Y1);

    // Function call
    // DDA(X0, Y0, X1, Y1);
    bresenham(X0, Y0, X1, Y1);
    // DDA(2, 2, 14, 16);
    getch();
    closegraph();
    return 0;
}
