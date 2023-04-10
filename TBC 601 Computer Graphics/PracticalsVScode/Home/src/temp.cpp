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


void trafficllight(bool red, bool yellow, bool green)
{
    int x=100, y=100;
    rectangle(x+10, y+10, x+60, y+160);
    // cout<< "red: "<<red<<endl;
    // cout<< "yellow: "<<yellow<<endl;
    // cout<< "green: "<<green<<endl;
    setfillstyle(SOLID_FILL, red==1? RED: WHITE);
    circle(x+35, y+35, 25);
    floodfill(x+35, y+35, BLACK);
    setfillstyle(SOLID_FILL, yellow? YELLOW: WHITE);
    circle(x+35, y+85, 25);
    floodfill(x+35, y+85, BLACK);
    setfillstyle(SOLID_FILL, green? GREEN: WHITE);
    circle(x+35, y+135, 25);
    floodfill(x+35, y+135, BLACK);
}



    int main()
    {
        int gd = DETECT, gm;
        initgraph(&gd, &gm, "");

        setfillstyle(SOLID_FILL, YELLOW);
        // draw a circle
        // circle(200, 200, 100);

        // set fill pattern and color
        while(1){
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
        // trafficllight(1, 1, 1);
        // fill the circle with yellow color
        // floodfill(200, 200, WHITE);

        getch();
        closegraph();
        return 0;
    }