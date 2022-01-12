#include<stdio.h>
#include<math.h>
#define f(x) x*x -2

int main(){
    int iter=1;
    float a, b, c, allerr;
    printf("Enter the initial guess a(negative): ");
    scanf(" %f", &a);
    printf("Enter the initial guess b(positive): ");
    scanf(" %f", &b);
    printf("Enter the allowed error: ");
    scanf(" %f", &allerr);
    printf("\n\na\t\tb\t\tf(a)\t\tf(b)\tc=a- f(a)(b-a)/f(b)-f(a)\tf(c)\n\n");

    do
    {
        /* code */
        float f_b= f(b);
        float f_a= f(a);
        c= a- f_a*(b-a)/(f_b-f_a);

        // printf("\n\na\t\tb\t\tf(a)\t\tf(b)\tc=a- f(a)(b-a)/f(b)-f(a)\tf(c)\n\n");
        printf("%f\t%f\t%f\t%f\t%f\t\t%f\n", a, b, f(a), f(b), c, f(c));

        if(f(c)<0){
            a=c;
        }
        else{
            b=c;
        }

        iter++;
    // } while (iter<2);
    } while (fabs(f(c)) >allerr);
    
    printf("The root of the equation is %f\n", c);

    return 0;
}