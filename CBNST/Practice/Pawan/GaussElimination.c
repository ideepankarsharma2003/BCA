#include <stdio.h>

int main()
{
	int n;
	printf("Enter number of unknown arguments");
	scanf("%d", &n);
	double arr[n][n + 1], x[n];
	double X[n];
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n + 1; j++)
		{
			printf("Enter arr[%d][%d] :", i, j);
			scanf("%lf", &arr[i][j]);
		}
	}
	printf("\n\n");
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n + 1; j++)
		{
			printf("%.3lf\t", arr[i][j]);
		}
		printf("\n");
	}
	printf("\n\n");
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			if (i != j)
			{
				double p = arr[j][i] / arr[i][i];
				for (int k = 0; k < n + 1; k++)
				{
					arr[j][k] = arr[j][k] - p * arr[i][k];
				}
			}
		}
	}
	// for(int i=0;i<n-1;i++){
	// 	for(int j=i+1;j<n;j++){
	// 	double p=arr[j][i]/arr[i][i];
	// 	   for(int k=0;k<n+1;k++){
	// 	   arr[j][k]=arr[j][k]-p*arr[i][k];
	// 	   }
	// 	}
	// }

	for (int i = 0; i < n; i++)
	{
		//   for(int j=0;j<n+1;j++){
		// 	printf("%.3lf\t",arr[i][j]);
		// 	}
		// printf("\n");
		// }
		// for(int i=n-1;i>=0;i--){
		// 	double sum=0;
		// 	for(int j=i+1;j<n;j++){
		// 	sum=sum+arr[i][j]*X[j];
		// 	}
		X[i] = (arr[i][n]) / arr[i][i];
	}
	// for(int i=0;i<n;i++){
	//   for(int j=0;j<n+1;j++){
	// 	printf("%.3lf\t",arr[i][j]);
	// 	}
	// printf("\n");
	// }
	// for(int i=n-1;i>=0;i--){
	// 	double sum=0;
	// 	for(int j=i+1;j<n;j++){
	// 	sum=sum+arr[i][j]*X[j];
	// 	}
	// 	X[i]=(arr[i][n]-sum)/arr[i][i];
	// }
	printf("\n");
	printf("The values are: \n");
	for (int i = 0; i < n; i++)
	{
		printf("\nX[%d]=%.2lf", i, X[i]);
	}
	return 0;
}