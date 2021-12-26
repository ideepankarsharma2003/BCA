#include<stdio.h>
#include<math.h>
#define max 10

float arr[max][max];
float X[max];

void displayMatrix(int n){
    for (int i = 0; i < n; i++)
    {
        /* code */
        for(int j=0; j<n+1; j++){
            printf("%f\t", arr[i][j]);
        }
        printf("\n");
    }
    
}

void displayMatrixSolution(int n){
    for (int i = 0; i < n; i++)
    {
        printf("X[%d]= %f\n", i, X[i]);
    }
}

int main(){
    int n;

    printf("Enter the number of the unknown variables: ");
    scanf(" %d", &n);
    for (int  i = 0; i < n; i++)
    {
        /* code */
        for (int j = 0; j < n+1; j++)
        {
            /* code */
            printf("Enter arr[%d][%d]: ", i, j);
            scanf("%f", &arr[i][j]);
        }
        
    }
    printf("\nThe augmented matrix is: \n\n");
    displayMatrix(n);


    // upper triangular matrix
    for (int i = 0; i < n-1; i++)
    {
        /* code */
        for(int j= i+1; j<n; j++){
            // if(i!=j){
                float p= arr[j][i]/arr[i][i];
                for (int k=0; k<n+1; k++){
                    arr[j][k]=arr[j][k]- p*arr[i][k];
                }
            // }
        }
    }

    printf("\nUpper Triangular Matrix: \n");
    displayMatrix(n);
    
    // Backward Substitution Method 
    // for(int i=n-1; i>=0; i--){
    //     float sum=0;
    //     for(int j=i+1; j<n; j++){
    //         sum+=arr[i][j]*X[j];
    //     }
    //     X[i]= (arr[i][n]- sum)/arr[i][i];
    // }

    for (int i = n - 1; i >= 0; i--)
    {
        float sum = 0;
        for (int j = i + 1; j < n; j++)
        {
            sum = sum + arr[i][j] * X[j];
        }

        X[i] = (arr[i][n] - sum) / arr[i][i];
    }

    printf("\nAfter applying Backward Substitution: \n");
    displayMatrixSolution(n);

    return 0;
}