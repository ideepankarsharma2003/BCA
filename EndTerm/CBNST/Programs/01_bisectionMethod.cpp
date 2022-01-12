#include<stdio.h>
#include<math.h>
#define f(x) x*x*x - 6

int main(){
    int iter=1;
    float a, b, c, allerr;
    printf("Enter the value of a(negative): ");
    scanf(" %f", &a);
    printf("Enter the value of b(positive): ");
    scanf(" %f", &b);
    printf("Enter the value of allowed error: ");
    scanf(" %f", &allerr);

    printf("\n\na\t\tb\t\tf(a)\t\tf(b)\t\tc=(a+b)/2\t\tf(c)\n\n");

    do{
        c= (a+b)/2;
        printf("%f\t%f\t%f\t%f\t%f\t%f\n", a, b, f(a), f(b), c, f(c));
        if(f(c)<0){
            a=c;
        }
        else{
            b=c;
        }

    }while(fabs(f(c))>allerr);

    printf("\n\nThe root is: %f\n", c);

    return 0;
}