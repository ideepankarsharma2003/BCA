#include<graphics.h>
int main()
{
    int gd=DETECT,gm;
    initgraph(&gd,&gm,"");
    circle(200,200,100);
    getch();
}


/*
-lbgi
-lgdi32
-lcomdlg32
-luuid
-loleaut32
-lole32


*/
