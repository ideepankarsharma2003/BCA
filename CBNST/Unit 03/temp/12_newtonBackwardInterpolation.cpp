#include<iostream>

using namespace std;
int main(){
    int n;
    printf("Enter the number of known variables: ");
    cin>>n;
    
    // float  mat[n][n+1]={0.0};
    static float  mat[10][10]={0.0};
    for (int i = 0; i < n; i++)
    {
        /* code */
        printf("Enter x%d: ", i+1);
        cin>>mat[i][0];
        printf("Enter y%d: ", i+1);
        cin>>mat[i][1];
    }


        cout<<"x"<<'\t'<<"y"<<endl<<endl;

    for (int i = 0; i < n; i++)
    {
        /* code */
        cout<<mat[i][0]<<'\t'<<mat[i][1]<<endl;
        
    }

    // difference table
    for (int j = 2; j < n+1; j++)
    {
        /* code */
        for (int i = n-1; i > j-2; i--)
        {
            /* code */
            // mat[i+1][j]= mat[i+1][j-1]- mat[i][j-1];
            mat[i][j]= mat[i][j-1]- mat[i-1][j-1];
        }
        
    }

    // displaying the difference table
    cout<<"\nDisplaying the difference table: "<<endl<<endl;
    cout<<"x"<<'\t'<<"y"<<'\t'<<"dy1"<<'\t'<<"dy2"<<'\t'<<"dy3"<<'\t'<<"dy4"<<'\t'<<"dy5";
    cout<<endl<<endl;
    


    for (int i = 0; i < n; i++)
    {
        /* code */
        // if(i<2)
        for (int j = 0, j_dash=n; j_dash >= 0; j++, j_dash--)
        {
            /* code */
            cout<<mat[i][j]<<'\t';
        }
        // else
        cout<<endl;
        
    }


    // applying the Newton Backward formula

    float x;
    cout<<"Enter the value of x at which you want to calculate the value of y: ";
    scanf(" %f", &x) ;

    float p= x-mat[0][0];
    p/=(mat[n][0]-mat[0][0]);
    float p0=p;
    float sum=0.0;
    sum=sum+mat[0][1];
    int k=1;
    for (int j = 2; j < n+1; j++)
    {
        /* code */
        sum+= (p*mat[0][j])/k;
        k*=j;
        p*=(p0+j-1);
    }

    printf("Value of y at x=%f is: %f", x, sum);
    
    
    
    return 0;
}