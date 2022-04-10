from queue import PriorityQueue


def best_first_search(graph, start, goal):

    # CLOSED = [False] * n # will have nodes that have been visited
    # CLOSED = True
    # n = graph.keys().__len__()

    CLOSED= []
    OPEN = PriorityQueue()
    # print(OPEN)
    OPEN.put((0, start)) # put start state in the OPEN queue

    path = []


    if not OPEN.empty():
        while OPEN.empty() == False:
            print()
            vertex = OPEN.get()[1]

            # Displaying the path having lowest cost
            print(f'vertex: {graph[vertex]}')
            print(f'cur. path: {path}')
            path.append(vertex)
            if vertex == goal:
                break

            # print(graph[vertex])

            for neighbour in graph[vertex]:
                if neighbour[1] not in CLOSED:
                    CLOSED.append(neighbour[1])
                    print('closed: ', CLOSED)
                    OPEN.put(neighbour)

    else:
        print("Failure !!!!")
    return f'\n\nFinal path:=>    {path}'


# graph = {
#     's': [(3, 'a'), (2, 'b')],
#     'a': [(4, 'c'), (1, 'd')],
#     'b': [(3, 'e'), (1, 'f')],
#     'e': [(5, 'h')],
#     'f': [(2, 'i'), (3, 'g')],
#     'c': [],
#     'd': [],
#     'h': [],
#     'i': [],
#     'g': [],

# }

# start = 's'
# goal = 'g'
# print(BestFirstSearch.best_first_search(graph, start, goal))






