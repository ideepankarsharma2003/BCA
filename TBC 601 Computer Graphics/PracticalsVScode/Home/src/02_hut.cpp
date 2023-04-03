#include<graphics.h>

int main(){
    // draw a hut
    int gDriver = DETECT, gMode;
    initgraph(&gDriver, &gMode, NULL);
    // draw a rectangle
    rectangle(100, 100, 300, 300);
    // draw a triangle
    line(100, 100, 200, 50);
    line(200, 50, 300, 100);
    line(100, 100, 300, 100);
    // draw a door
    rectangle(150, 230, 200, 300);
    // outtextxy(150, 250, "(150, 250)");
    // draw a window
    // rectangle(250, 150, 300, 200);
    circle(150, 150, 30);
    circle(250, 150, 30);
    getch();
    closegraph();
    return 0;
}