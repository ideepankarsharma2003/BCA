/**
 * @file 01_smiley.cpp
 * @author your name (you@domain.com)
 * @brief 
 * @version 0.1
 * @date 2023-04-01
 * 
 * @copyright Copyright (c) 2023
 * Draw a smiley using the graphics
 */

#include <graphics.h>
int main(){
    // draw graphics using graphics.h   
    int gDriver = DETECT, gMode;
    initgraph(&gDriver, &gMode, NULL);
    // draw a circle
    circle(200, 200, 100);
    // draw a smile
    arc(200, 200, 210, 330, 50);
    // draw eyes
    circle(170, 180, 5);
    circle(230, 180, 5);
    // draw a nose
    line(200, 200, 200, 230);
    getch();
    closegraph();
    return 0;
}