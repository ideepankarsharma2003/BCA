import Queue

def BFS(graph, start):
    # graph:-----> Python dictionary to act as an adjacency list

    q= Queue.Queue()
    q.enqueue(start)
    path = []

    while not q.is_empty():
        vertex = q.dequeue() 
        if vertex in path:
            continue
        path.append(vertex)
        for neighbor in graph[vertex]:
            q.enqueue(neighbor)

    return path

