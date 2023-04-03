#include <graphics.h>
#include<iostream>
using namespace std;
int main(){
	// cout<<"Hello World";
	int gd= DETECT, gm;
	initgraph(&gd, &gm, NULL);
	
	outtext("This is great !!!!");
	
	
	// The smiley face !!!
	setfillstyle(SOLID_FILL, YELLOW);
	circle(100, 100, 50);	
	
	circle(75, 75, 3);
	setfillstyle(SOLID_FILL, BLACK);

	circle(125, 75, 3);
	setfillstyle(SOLID_FILL, BLACK);	
	
	arc(100, 105, 200, 340, 20);
	
	
	// House 
	rectangle(150, 215, 300, 300);
	line(150, 215, 225, 200);
	line(300, 215, 225, 200);
	rectangle(175, 275, 215, 300);
	circle(185, 230, 5);
	
	
	getch();
	closegraph();
	return 0;
}
