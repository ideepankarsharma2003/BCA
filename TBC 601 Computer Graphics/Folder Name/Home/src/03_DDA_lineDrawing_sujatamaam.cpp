#include<graphics.h>
#include<iostream>
#include<math.h>

using namespace std;

void DDA(int x1, int y1, int x2, int y2){
    int dx= x2-x1;
    int dy= y2-y1;
    int steps= dx>=dy? abs(dx):abs(dy);
    float xinc= dx/(float)steps;
    float yinc= dy/(float)steps;
    int i= 0;

    cout<<xinc<<'\t'<<yinc<<endl;

    cout<<"\nThe consequent coordinates are: "<<endl;
    int x= x1, y=y1;
    cout<< "x0: "<<x<<", y0:"<<y<<endl;
    while (i<=steps)
    // while (i<=10)
    {
        /* code */
        putpixel(x, y, RED);
        x+=xinc;
        y+=yinc;
        i++;
        cout<< "x_next: "<<x<<", y_next:"<<y<<endl;
    }
    putpixel(x, y, RED);
    
}





int main(){
    int gMode;
    int gDrive;

    initgraph(&gDrive, &gMode, NULL);

    int X0 = 0, Y0 = 0, X1 = 0, Y1 = 0;

    printf("The constraint on the X-axis are(0-%d)\n", getmaxx());
    printf("The constraint on the Y-axis are(0-%d)\n", getmaxy());

    printf("Enter the X0:\t");
    scanf("%d", &X0);
    printf("Enter the Y0:\t");
    scanf("%d", &Y0);
    printf("Enter the X1:\t");
    scanf("%d", &X1);
    printf("Enter the Y1:\t");
    scanf("%d", &Y1);

    DDA(X0, Y0, X1, Y1);
    getch();
    closegraph();
    return 0;
}