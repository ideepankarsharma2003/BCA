#include <graphics.h>

void red_circle()
{
    setfillstyle(SOLID_FILL, RED);
    circle(35, 35, 25);
    floodfill(35, 35, WHITE);
}
void yellow_circle()
{
    setfillstyle(SOLID_FILL, YELLOW);
    circle(35, 85, 25);
    floodfill(35, 85, WHITE);
}
void green_circle()
{
    setfillstyle(SOLID_FILL, GREEN);
    circle(35, 135, 25);
    floodfill(35, 135, WHITE);
}

int main()
{
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "");

    while (1)
    {
        rectangle(10, 10, 60, 160);
        red_circle();
        delay(400);
        cleardevice();
        rectangle(10, 10, 60, 160);
        yellow_circle();
        delay(400);
        cleardevice();
        rectangle(10, 10, 60, 160);
        green_circle();
        delay(400);
        cleardevice();
    }
    getch();
    closegraph();
    return 0;
}