class Tables:
    def __init__(self):
        self.pnTable()
    def pnTable(self):
        for i in range(2,6):
            for j in range(1, 6):
                print(f'{i}*{j} =  {i*j}')
            print()
 
x=Tables()