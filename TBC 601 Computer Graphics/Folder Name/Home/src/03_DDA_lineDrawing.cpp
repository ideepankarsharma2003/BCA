
#include <graphics.h>
#include <math.h>
#include <stdio.h>
int abs(int n) { return ((n > 0) ? n : (n * (-1))); }

// DDA Function for line generation
void DDA(int X0, int Y0, int X1, int Y1)
{
    // calculate dx & dy
    int dx = X1 - X0;
    int dy = Y1 - Y0;

    // calculate steps required for generating pixels
    int steps = abs(dx) > abs(dy) ? abs(dx) : abs(dy);

    // calculate increment in x & y for each steps
    float Xinc = dx / (float)steps;
    float Yinc = dy / (float)steps;

    // Put pixel for each step
    float X = X0;
    float Y = Y0;

    int color=1;
    for (int i = 0; i <= steps; i++)
    {
        // putpixel(round(X), round(Y),YELLOW); // put pixel at (X,Y)
        putpixel(round(X), round(Y),color); // put pixel at (X,Y)
        X += Xinc;     // increment in x at each step
        Y += Yinc;     // increment in y at each step
        delay(100);    // for visualization of line-
                    // generation step by step
        color= (color+1)%20;
    }
}

int main()
{
    int gDrive = DETECT;

    int gMode;

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


    // Function call
    DDA(X0, Y0, X1, Y1);
    // DDA(2, 2, 14, 16);
    getch();
    closegraph();
    return 0;
}



