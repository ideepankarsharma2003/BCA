#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter the number of known variables: ";
    cin >> n;

    static float mat[10][2] = {0.0};
    for (int i = 0; i < n; i++)
    {
        /* code */
        printf("Enter x%d: ", i + 1);
        cin >> mat[i][0];
        printf("Enter y%d: ", i + 1);
        cin >> mat[i][1];
    }

    cout<<endl<<endl;
    // printing the table
    cout << "x" << '\t' << "y" << endl<< endl;
    for (int i = 0; i < n; i++)
    {
        /* code */
        cout << mat[i][0] << '\t' << mat[i][1] << endl;
    }


    float x;
    cout << "Enter the value of x at which you want to calculate the value of y: ";
    scanf(" %f", &x);

    // applying the Lagrange's Interpolation Formula
    float sum =0.0;
    for (int i = 0; i < n; i++)
    {
        float z= 1.0;
        // cout<<z<<endl;
        /* code */
        for (int j = 0; j < n; j++)
        {
            /* code */
            if (i!=j)
            {
                /* code */
                z *= (x - mat[j][0]);         // --------> x- x[j]
                z /= (mat[i][0] - mat[j][0]); // --------> x[i]- x[j]
                // cout << z << '\t' << sum << endl;
            }
            
        }
        
        z*=mat[i][1]; // --------> y[i]        
        sum+=z;        
    }

    printf("Value of y at x=%f is: %f\n\n", x, sum);

    return 0;
}