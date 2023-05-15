#include <iostream>
#include <graphics.h>

using namespace std;

const int LEFT = 1;   // 0001
const int RIGHT = 2;  // 0010
const int BOTTOM = 4; // 0100
const int TOP = 8;    // 1000

int xmin, xmax, ymin, ymax;

int getOutcode(int x, int y)
{
    int code = 0;
    if (x < xmin)
        code |= LEFT;
    if (x > xmax)
        code |= RIGHT;
    if (y < ymin)
        code |= BOTTOM;
    if (y > ymax)
        code |= TOP;
    return code;
}

void cohenSutherlandClipLine(int x1, int y1, int x2, int y2)
{
    int outcode1 = getOutcode(x1, y1);
    int outcode2 = getOutcode(x2, y2);
    bool accept = false;
    while (true)
    {
        if (!(outcode1 | outcode2))
        { // trivially accepted -> line clipping window k andar h
            accept = true;
            break;
        }
        else if (outcode1 & outcode2)
        { // trivially rejected -> line is completely invisible
            break;
        }
        else
        {
            int x, y;
            int outcode = outcode1 ? outcode1 : outcode2;
            if (outcode & TOP)
            {
                x = x1 + (x2 - x1) * (ymax - y1) / (y2 - y1);
                y = ymax;
            }
            else if (outcode & BOTTOM)
            {
                x = x1 + (x2 - x1) * (ymin - y1) / (y2 - y1);
                y = ymin;
            }
            else if (outcode & RIGHT)
            {
                y = y1 + (y2 - y1) * (xmax - x1) / (x2 - x1);
                x = xmax;
            }
            else
            { // LEFT
                y = y1 + (y2 - y1) * (xmin - x1) / (x2 - x1);
                x = xmin;
            }
            if (outcode == outcode1)
            {
                x1 = x;
                y1 = y;
                outcode1 = getOutcode(x1, y1);
            }
            else
            {
                x2 = x;
                y2 = y;
                outcode2 = getOutcode(x2, y2);
            }
        }
    }
    if (accept)
    {
        setcolor(GREEN);
        line(x1, y1, x2, y2);
        outtextxy(x1, y1, "(x1', y1')");
        outtextxy(x2, y2, "(x2', y2')");
    }
}

int main()
{
    int gd = DETECT, gm;
    initgraph(&gd, &gm, NULL);
    printf("The constraint on the X-axis are(0-%d)\n", getmaxx());
    printf("The constraint on the Y-axis are(0-%d)\n", getmaxy());

    // take input for the clipping window
    cout << "Enter the coordinates of the clipping window (xmin): ";
    cin >> xmin;
    cout << "Enter the coordinates of the clipping window (ymin): ";
    cin >> ymin;
    cout << "Enter the coordinates of the clipping window (xmax): ";
    cin >> xmax;
    cout << "Enter the coordinates of the clipping window (ymax): ";
    cin >> ymax;

    setcolor(YELLOW);
    line(xmin, ymin, xmax, ymin);
    line(xmax, ymin, xmax, ymax);
    line(xmax, ymax, xmin, ymax);
    line(xmin, ymax, xmin, ymin);

    int x1, y1, x2, y2;
    cout << "Enter the coordinates of the line to be clipped (x1): ";
    cin >> x1;
    cout << "Enter the coordinates of the line to be clipped (y1): ";
    cin >> y1;
    cout << "Enter the coordinates of the line to be clipped (x2): ";
    cin >> x2;
    cout << "Enter the coordinates of the line to be clipped (y2): ";
    cin >> y2;

    setcolor(WHITE);
    line(x1, y1, x2, y2);
    outtextxy(x1, y1, "(x1, y1)");
    outtextxy(x2, y2, "(x2, y2)");
    cohenSutherlandClipLine(x1, y1, x2, y2);

    getch();
    closegraph();
    return 0;
}
