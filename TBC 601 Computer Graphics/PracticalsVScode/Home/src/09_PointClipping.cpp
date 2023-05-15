#include <iostream>
#include <graphics.h>


using namespace std;



void clipPoint(int x, int y, int xmin, int ymin, int xmax, int ymax)
{
    if (x < xmin || x > xmax || y < ymin || y > ymax)
        {cout << "Point is outside the clipping window\n";
        putpixel(x, y, RED);}
    else
        {cout << "Point is inside the clipping window\n";
        putpixel(x, y, GREEN);
        outtextxy(x-1, y-1, "(x,y)");}
}

int main()
{
    int gd = DETECT, gm;
    initgraph(&gd, &gm, NULL);

    printf("The constraint on the X-axis are(0-%d)\n", getmaxx());
    printf("The constraint on the Y-axis are(0-%d)\n", getmaxy());

    int x, y, xmin, ymin, xmax, ymax;
    // take input for the clipping window
    cout << "Enter the coordinates of the clipping window (xmin): ";
    cin >> xmin;
    cout << "Enter the coordinates of the clipping window (ymin): ";
    cin >> ymin;
    cout << "Enter the coordinates of the clipping window (xmax): ";
    cin >> xmax ;
    cout << "Enter the coordinates of the clipping window (ymax): ";
    cin >> ymax;

    // draw the clipping window
    rectangle(xmin, ymin, xmax, ymax);

    // take input for the point to be clipped
    cout << "Enter the coordinates of the point to be clipped (x): ";
    cin >> x;
    cout << "Enter the coordinates of the point to be clipped (y): ";
    cin >> y;

    // draw the point
    putpixel(x, y, WHITE);
    delay(1000);


    // clip the point
    clipPoint(x, y, xmin, ymin, xmax, ymax);

    getch();
    closegraph();
    return 0;
}
