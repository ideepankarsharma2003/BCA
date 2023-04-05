#include <iostream>
#include <graphics.h>

using namespace std;

void drawTrafficLight(int x, int y, int lightSize, bool isRedOn, bool isYellowOn, bool isGreenOn)
{
    // Draw black background
    setfillstyle(SOLID_FILL, BLACK);
    bar(x, y, x + lightSize, y + 3 * lightSize);

    // Draw red light
    setfillstyle(SOLID_FILL, isRedOn ? RED : DARKGRAY);
    circle(x + lightSize / 2, y + lightSize / 2, lightSize / 2);
    floodfill(x + lightSize / 2, y + lightSize / 2, WHITE);

    // Draw yellow light
    setfillstyle(SOLID_FILL, isYellowOn ? YELLOW : DARKGRAY);
    circle(x + lightSize / 2, y + lightSize + lightSize / 2, lightSize / 2);
    floodfill(x + lightSize / 2, y + lightSize + lightSize / 2, WHITE);

    // Draw green light
    setfillstyle(SOLID_FILL, isGreenOn ? GREEN : DARKGRAY);
    circle(x + lightSize / 2, y + 2 * lightSize + lightSize / 2, lightSize / 2);
    floodfill(x + lightSize / 2, y + 2 * lightSize + lightSize / 2, WHITE);
}

int main()
{
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "");

    int lightSize = 100;
    int x = (getmaxx() - lightSize) / 2;
    int y = (getmaxy() - 3 * lightSize) / 2;

    while (true)
    {
        drawTrafficLight(x, y, lightSize, true, false, false);
        delay(400);
        drawTrafficLight(x, y, lightSize, true, true, false);
        delay(400);
        drawTrafficLight(x, y, lightSize, false, false, true);
        delay(400);
        drawTrafficLight(x, y, lightSize, false, true, false);
        delay(400);
    }

    getch();
    closegraph();
    return 0;
}
