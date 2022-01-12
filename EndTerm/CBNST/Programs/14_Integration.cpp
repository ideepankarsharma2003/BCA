#include <iostream>
#define f(x) 1 / (1 + (x * x))

float ll; // lower limit
float ul; // upper limit
int n;    // number of intervals
static float mat[10][2] = {0.0};

float trapezoidalRule(float h, int n)
{
    float sum = mat[0][1] + mat[n][1]; // y[0]+y[n]
    for (int i = 1; i < n; i++)
    {
        /* code */
        sum += 2 * mat[i][1]; // 2*y[i]
    }
    sum *= (h / 2);
    printf("The integration of the given function over the limit %f to %f using Trapezoidal Rule is %f\n\n", ll, ul, sum);
    return sum;
}

float simpson1By3(float h, int n)
{
    if (n % 2 != 0)
    {
        printf("Can't apply Simpson's 1/3 Rule !!!!\n\n");
        return -1;
    }

    else
    {
        float sum = mat[0][1] + mat[n][1]; // y[0]+y[n]
        float sumEven = 0.0, sumOdd = 0.0;

        for (int i = 1; i < n; i++)
        {
            /* code */
            if (i % 2 == 0)
            {
                /* code */
                sumEven += 2 * mat[i][1]; // 2*y[i]
            }
            else
                sumOdd += 4 * mat[i][1]; // 4*y[i]
        }
        sum += sumEven + sumOdd;
        sum *= (h / 3);
        printf("The integration of the given function over the limit %f to %f using Simpson's 1/3 Rule is %f\n\n", ll, ul, sum);
        return sum;
    }
}

float simpson3By8(float h, int n)
{
    if (n % 3 != 0)
    {
        printf("Can't apply Simpson's 3/8 Rule !!!!\n\n");
        return -1;
    }

    else
    {
        float sum = mat[0][1] + mat[n][1];  // y[0]+y[n]
        float sum3X = 0.0, sumOthers = 0.0; // sum3X---> multiples of 3, sumOthers----> others

        for (int i = 1; i < n; i++)
        {
            /* code */
            if (i % 3 == 0)
            {
                /* code */
                sum3X += 2 * mat[i][1]; // 2*y[i]
            }
            else
                sumOthers += 3 * mat[i][1]; // 3*y[i]
        }
        sum += sum3X + sumOthers;
        sum *= ((3 * h) / 8);
        printf("The integration of the given function over the limit %f to %f using Simpson's 3/8 Rule is %f\n\n", ll, ul, sum);
        return sum;
    }
}

using namespace std;
int main()
{
    cout << "Enter the lower limit: ";
    cin >> ll;
    cout << "Enter the upper limit: ";
    cin >> ul;
    cout << "Enter the number of intervals: ";
    cin >> n;

    float h = (ul - ll) / n;
    float z = ll;

    for (int i = 0; i <= n; i++)
    {
        /* code */
        mat[i][0] = (z);  // x[i]
        mat[i][1] = f(z); // y[i]
        z += h;
    }
    cout << endl
         << endl;

    // printing the table
    cout << "x: ";
    for (int i = 0; i < n; i++)
    {
        /* code */
        printf("%.6f\t", mat[i][0]);
    }
    cout << endl;
    cout << "y: ";
    for (int i = 0; i < n; i++)
    {
        /* code */
        printf("%.6f\t", mat[i][1]);
        // cout << mat[i][1] << "\t";
    }

    cout << endl
         << endl;

    do
    {
        /* code */
        int choice = 0;
        cout << "(1). Trapezoidal Rule" << endl;
        cout << "(2). Simpson's 1/3 Rule" << endl;
        cout << "(3). Simpson's 3/8 Rule" << endl;
        cout << "(4). Exit" << endl;
        cout << "Using which rule would you like to integrate?  : ";
        scanf(" %d", &choice);

        switch (choice)
        {
        case 1:
            trapezoidalRule(h, n);
            /* code */
            break;
        case 2:
            simpson1By3(h, n);
            /* code */
            break;
        case 3:
            simpson3By8(h, n);
            /* code */
            break;

        default:
            cout << "EXIT" << endl;
            goto x;
        }

    } while (1);

x:
    return 0;
}