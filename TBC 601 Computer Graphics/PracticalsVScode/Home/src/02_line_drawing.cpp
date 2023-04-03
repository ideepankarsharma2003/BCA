/**
 * @file 02_line_drawing.cpp
 * @author your name (you@domain.com)
 * @brief
 * @version 0.1
 * @date 2023-04-01
 *
 * @copyright Copyright (c) 2023
 *  To divide your screen into four region, draw circle, rectangle, ellipse ,square.
 */

#include <graphics.h>

int main()
{
    int gDrive = DETECT; 

    int gMode;

    initgraph(&gDrive, &gMode, NULL);
    // initgraph initializes the graphics system by loading a graphics driver from disk
    // and puts the system into graphics mode

    line(0, getmaxy()/2, getmaxx(), getmaxy()/2); // horizontal line
    line(getmaxx()/2, 0, getmaxx()/2, getmaxy()); // vertical line

    int cx= getmaxx()/2;
    int cy= getmaxy()/2;
    char message[20] = "(0, 0) origin";
    outtextxy(cx, cy, message);



    setfillstyle(SOLID_FILL, RED);
    // setcolor(YELLOW);
    circle(cx-100, cy-100, 50);
    floodfill(cx-98, cy-98, 15);



    /* 
    int xmax = getmaxx();
    int ymax = getmaxy();
    line(xmax / 2, 0, xmax / 2, ymax);
    line(0, ymax / 2, xmax, ymax / 2);
    outtextxy(xmax / 2, ymax / 2, "(0,0)");
    setcolor(GREEN);
    setfillstyle(HATCH_FILL, RED);
    circle(170, 125, 100);
    outtextxy(160, 135, "circle");
    floodfill(170, 125, GREEN);
    setcolor(YELLOW);
    setfillstyle(2, RED);
    rectangle(58, 251, 304, 392);
    outtextxy(70, 300, "Rectangle");
    floodfill(70, 351, YELLOW);
    setcolor(BLUE);
    setfillstyle(3, RED);
    rectangle(400, 50, 500, 150);
    outtextxy(450, 70, "square");
    floodfill(450, 80, BLUE);
    setcolor(RED);
    setfillstyle(4, RED);
    ellipse(500, 300, 0, 360, 75, 25);
    outtextxy(500, 300, "ellipse");
    floodfill(500, 300, RED);
    */



    getch();
    closegraph();
}
