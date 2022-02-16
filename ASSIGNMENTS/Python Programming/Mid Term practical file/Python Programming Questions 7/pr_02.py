def totalCost(cost):
    if(cost>1000):
        cost = 0.9*cost
    return cost

cost = int(input('Enter the cost of purchased quantity for the customer: '))
print('The total cost after calculating the discount: ', totalCost(cost))