#include<graphics.h>
#include <conio.h>
int main()
{
    int gd = DETECT, gm;
    initgraph(&gd,&gm, "C:\\tc\\bgi");
    
    setcolor(YELLOW);
 
    circle(300, 100, 40);
    setfillstyle(SOLID_FILL, YELLOW);
//    setfillstyle(SOLID_FILL, GREEN);
	floodfill(300, 100, YELLOW);
 
    setcolor(BLACK);
    setfillstyle(SOLID_FILL, BLACK);
 
    fillellipse(310, 85, 2, 6);
    fillellipse(290, 85, 2, 6);
 
    ellipse(300, 100, 205, 335, 20, 9);
    ellipse(300, 100, 205, 335, 20, 10);
    ellipse(300, 100, 205, 335, 20, 11);
 

//    circle(300,300,50);
//    setfillstyle(1, BLUE);
//line()
//    closegraph();
    getch();
}

/*
-lbgi
-lgdi32
-lcomdlg32
-luuid
-loleaut32
-lole32


-libgcc -lbgi -lgdi32 -lcomdlg32 -luuid -loleaut32 -lole32
*/
