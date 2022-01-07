#include <iostream>
#include<math.h>
#define f(x, y) (2*y) + (3*exp(x))
// #define f(x, y) x+ (y*y)

// float y0, x0=0;
float h;    // gap in intervals
static float x[10]= {0.0}, y[10]= {0.0};

using namespace std;


float k1(int n){
    
    float k1 = f(x[n], y[n]);
    k1*=h;
    // cout<<"h: "<<h<<endl;
    // cout<<"xn: "<<x[n]<<endl;
    // cout<<"yn: "<<y[n]<<endl;
    // cout << "fn: " << f(x[n], y[n]) << endl;
    // cout<<"k1: "<<k1<<endl;
    return k1;
}

float k2(int n){
    float a= x[n]+ (h/2);
    float b= y[n]+ (k1(n)/2);
    float k2 = f(a, b);
    k2 *= h;
    // cout << "h: " << h << endl;
    // cout << "a: " << a << endl;
    // cout << "b: " << b << endl;
    // cout << "fn: " << f(a, b) << endl;
    // cout << "k2: " << k2 << endl;
    return k2;
}

float k3(int n){
    float a= x[n]+ (h/2);
    float b= y[n]+ (k2(n)/2);
    float k3 = f(a, b);
    k3 = h * k3;
    // cout << "h: " << h << endl;
    // cout << "a: " << a << endl;
    // cout << "b: " << b << endl;
    // cout << "fn: " << f(a, b) << endl;
    // cout << "k2: " << k3 << endl;
    return k3;
}

float k4(int n){
    float a= x[n]+ (h);
    float b= y[n]+ (k3(n));
    float k4= f(a, b);
    k4= k4*h;
    // cout << "h: " << h << endl;
    // cout << "a: " << a << endl;
    // cout << "b: " << b << endl;
    // cout << "fn: " << f(a, b) << endl;
    // cout << "k4: " << k4 << endl;
    return k4;
}

float k(int n){
    float k= k1(n)+ 2*k2(n)+ 2*k3(n)+ k4(n);
    k/=6;
    printf("k[%d]: %.6f\n", n, k);
    // cout << "k: " << k << endl;
    return k;
}





int main()
{
    int n=0;    // number of iterations
    float x_unk, y_unk=0; // xUknown, yUknown
    cout << "Enter the y(x0): ";
    cin >> y[0];
    // y[0]= 1;
    cout << "Enter the gap in intervals (h): ";
    cin >> h;
    // h= .1;
    cout << "Enter the value of x at which you want to approximate y(x): ";
    cin >> x_unk;
    // x_unk= .2;


    n= (x_unk-x[0])/h;

    // k(0);

    for (int i = 0; i < n; i++)
    {
        /* code */
        printf("at n=%d, \n", i);
        // cout<< k(n)<<endl;
        y[i+1]= y[i]+ k(i);
        x[i+1]= x[i]+ h;
        printf("y[%d]:  %.6f", i+1, y[i+1]);
        y_unk= y[i+1];

        cout<<endl<<endl;
    }


    cout<< "The value of y(" << x_unk << "): "<< y_unk<<endl;
    

    
    return 0;
}