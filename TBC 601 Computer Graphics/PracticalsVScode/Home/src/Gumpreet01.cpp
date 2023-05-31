
// // #include <stdio.h>
// // #include <graphics.h>

// // void drawCircle(int xc, int yc, int radius)
// // {
// //     int gd = DETECT, gm;
// //     initgraph(&gd, &gm, NULL);

// //     int x = 0;
// //     int y = radius;
// //     int d = 3 - 2 * radius;

// //     while (x <= y)
// //     {
// //         putpixel(xc + x, yc + y, WHITE);
// //         putpixel(xc - x, yc + y, WHITE);
// //         putpixel(xc + x, yc - y, WHITE);
// //         putpixel(xc - x, yc - y, WHITE);
// //         putpixel(xc + y, yc + x, WHITE);
// //         putpixel(xc - y, yc + x, WHITE);
// //         putpixel(xc + y, yc - x, WHITE);
// //         putpixel(xc - y, yc - x, WHITE);

// //         if (d < 0)
// //         {
// //             d += 4 * x + 6;
// //         }
// //         else
// //         {
// //             d += 4 * (x - y) + 10;
// //             y--;
// //         }
// //         x++;
// //     }

// //     delay(2000);
// //     getch();

// //     closegraph();
// // }

// // int main()
// // {
// //     int xc, yc, radius;

// //     printf("Enter the center coordinates of the circle (xc, yc): ");
// //     scanf("%d %d", &xc, &yc);

// //     printf("Enter the radius of the circle: ");
// //     scanf("%d", &radius);

// //     drawCircle(xc, yc, radius);
// //     return 0;
// // }

// #include <stdio.h>
// #include <graphics.h>
// #include <conio.h>
// int main()
// {
//     int gd = DETECT, gm;
//     int x, y, x1, y1, x2, y2, shear_f;
//     initgraph(&gd, &gm, "C:\\TURBOC3\\BGI");
//     printf("\n please enter first coordinate = ");
//     scanf("%d %d", &x, &y);
//     printf("\n please enter second coordinate = ");
//     scanf("%d %d", &x1, &y1);
//     printf("\n please enter third coordinate = ");
//     scanf("%d %d", &x2, &y2);
//     printf("\n please enter shearing factor x = ");
//     scanf("%d", &shear_f);
//     cleardevice();
//     line(x, y, x1, y1);
//     line(x1, y1, x2, y2);
//     line(x2, y2, x, y);

//     setcolor(RED);
//     x = x + y * shear_f;
//     x1 = x1 + y1 * shear_f;
//     x2 = x2 + y2 * shear_f;

//     line(x, y, x1, y1);
//     line(x1, y1, x2, y2);
//     line(x2, y2, x, y);
//     getch();
//     closegraph();
// }

#include <graphics.h>

#include <math.h>

                                                                                                                                                                          int graDriver = DETECT,
                                                                                                                                                                              graMode;

int n, xs[100], ys[100], i;

float shearXfactor, shearYfactor;

void DrawFn()

{

    for (i = 0; i < n; i++)

        line(xs[i], ys[i], xs[(i + 1) % n], ys[(i + 1) % n]);
}

void shearAlongX()

{

    for (i = 0; i < n; i++)

        xs[i] = xs[i] + shearXfactor * ys[i];
}

void shearAlongY()

{

    for (i = 0; i < n; i++)

        ys[i] = ys[i] + shearYfactor * xs[i];
}
int main()

{

    printf("Enter number of sides: ");

    scanf("%d", &n);

    printf("Enter co-rdinates: x,y for each point ");

    for (i = 0; i < n; i++)

        scanf("%d%d", &xs[i], &ys[i]);

    printf("Enter x shear factor:");

    scanf("%f", &shearXfactor);

    printf("Enter y shear factor:");

    scanf("%f", &shearYfactor);

    initgraph(&graDriver, &graMode, "C:\\TURBOC3\\BGI\\");

    setcolor(RED);

    DrawFn();

    shearAlongX();

    setcolor(YELLOW);

    DrawFn();

    shearAlongY();

    setcolor(GREEN);

    DrawFn();

    getch();
}