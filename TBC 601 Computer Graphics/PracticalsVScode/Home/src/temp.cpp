#include <graphics.h>

int main()
{
    int gDrive = DETECT;

    int gMode;

    initgraph(&gDrive, &gMode, NULL);
    // initgraph initializes the graphics system by loading a graphics driver from disk
    // and puts the system into graphics mode

    line(0, getmaxy() / 2, getmaxx(), getmaxy() / 2); // horizontal line
    line(getmaxx() / 2, 0, getmaxx() / 2, getmaxy()); // vertical line

    int cx = getmaxx() / 2;
    int cy = getmaxy() / 2;
    char message[20] = "(0, 0) origin";
    outtextxy(cx, cy, message);

    setfillstyle(SOLID_FILL, RED);
    // setcolor(YELLOW);
    circle(cx - 100, cy - 100, 50);
    floodfill(cx - 98, cy - 98, 15);

    getch();
    closegraph();
}
