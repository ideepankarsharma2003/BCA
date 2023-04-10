#include<iostream>
#include<graphics.h>
using namespace std;


void brensanham(int x0, int y0, int x1, int y1){
    int x=x0; int y=y0;
    if (x0 > x1)
    {
        x = x1;
        y = y1;
        x1 = x0;
        y1 = y0;
        x0 = x;
        y0 = y;
    }
    int dx= x1-x0;
    int dy= y1-y0;
    int p= 2*dy-dx;
    while(x<x1){
        if(p>=0){
            putpixel(x,y,WHITE);
            y=y+1;
            p=p+2*dy-2*dx;
        }
        else{
            putpixel(x,y,WHITE);
            p=p+2*dy;
        }
        x=x+1;
    }
}

int main(){
    int gd=DETECT, gm;
    initgraph(&gd, &gm, NULL);
    int x0, y0, x1, y1;
    cout<<"Enter the x0: ";cin>>x0;
    cout<<"Enter the y0: ";cin>>y0;
    cout<<"Enter the x1: ";cin>>x1;
    cout<<"Enter the y1: ";cin>>y1;


    brensanham(x0, y0, x1, y1);
    closegraph;
    return 0;
}