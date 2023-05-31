#include <iostream>
#include <graphics.h>
using namespace std;

// Class for a point
class Point
{
    public:
    int x, y;
};



void printPoly(Point polygon[], int n, int Color=RED){
    setcolor(Color);
    for (int i = 0; i < n; i++)
    {
        int next = (i + 1) % n;
        line(polygon[i].x, polygon[i].y, polygon[next].x, polygon[next].y);
    }
}

// Function to clip a polygon using Sutherland-Hodgman algorithm
// void sutherlandHodgman(Point clipWindow[], Point polygon[], int n)
// {
//     Point newPolygon[20];
    // for (int i = 0; i < 4; i++) // i will loop on edges of the clip window
    // {
    //     int newCount = 0;

    //     Point prev = polygon[n - 1];
    //     for (int j = 0; j < n; j++)
    //     {
    //         Point current = polygon[j];

    //         // If the point is inside the clip window, add it to the new polygon
    //         if (i == 0 && (prev.x < clipWindow[i].x) == (current.x < clipWindow[i].x))
    //             newPolygon[newCount++] = current;
    //         else if (i == 1 && (prev.x > clipWindow[i].x) == (current.x > clipWindow[i].x))
    //             newPolygon[newCount++] = current;
    //         else if (i == 2 && (prev.y < clipWindow[i].y) == (current.y < clipWindow[i].y))
    //             newPolygon[newCount++] = current;
    //         else if (i == 3 && (prev.y > clipWindow[i].y) == (current.y > clipWindow[i].y))
    //             newPolygon[newCount++] = current;
    //         else
    //         {
    //             // If the point lies on the edge of the clip window, add the intersection point
    //             if ((i == 0 || i == 1) && prev.x != current.x)
    //             {
    //                 Point intersection;
    //                 intersection.x = clipWindow[i].x;
    //                 intersection.y = prev.y + (clipWindow[i].x - prev.x) * (current.y - prev.y) / (current.x - prev.x);
    //                 newPolygon[newCount++] = intersection;
    //             }
    //             else if ((i == 2 || i == 3) && prev.y != current.y)
    //             {
    //                 Point intersection;
    //                 intersection.y = clipWindow[i].y;
    //                 intersection.x = prev.x + (clipWindow[i].y - prev.y) * (current.x - prev.x) / (current.y - prev.y);
    //                 newPolygon[newCount++] = intersection;
    //             }
    //         }

    //         prev = current;
    //     }

    //     // Update the polygon with the new clipped polygon
    //     n = newCount;
    //     for (int k = 0; k < newCount; k++)
    //         polygon[k] = newPolygon[k];
    //     printPoly(polygon, n, WHITE);
    //     delay(1000);
//     }

//     // Draw the clipped polygon
//     setcolor(GREEN);
//     for (int i = 0; i < n; i++)
//     {
//         int next = (i + 1) % n;
//         line(polygon[i].x, polygon[i].y, polygon[next].x, polygon[next].y);
//     }
// }

void sutherlandHodgman(Point clipWindow[], Point polygon[], int n)
{
    Point newPolygon[20];
    
}

    int main()
    {
        int gd = DETECT, gm;
        initgraph(&gd, &gm, "");

        // Define the clip window
        Point clipWindow[] = {{100, 100}, {400, 100}, {400, 300}, {100, 300}};

        // Define the polygon
        Point polygon[] = {{50, 200}, {200, 50}, {350, 200}, {200, 350}};
        int n = sizeof(polygon) / sizeof(polygon[0]);

        // Draw the clip window
        cout << "The clip window: " << endl;
        setcolor(YELLOW);
        for (int i = 0; i < 4; i++)
        {
            int next = (i + 1) % 4;
            line(clipWindow[i].x, clipWindow[i].y, clipWindow[next].x, clipWindow[next].y);
        }

        // Draw the original polygon
        delay(1000);
        cout << "The original polygon: " << endl;
        setcolor(RED);
        for (int i = 0; i < n; i++)
        {
            int next = (i + 1) % n;
            line(polygon[i].x, polygon[i].y, polygon[next].x, polygon[next].y);
        }

        // Clip the polygon using Sutherland-Hodgman algorithm
        delay(1000);
        cout << "The clipped polygon: " << endl;
        sutherlandHodgman(clipWindow, polygon, n);

        getch();
        closegraph();
        return 0;
    }
