import Stack

def DFS(graph, start):
    # graph:-----> Python dictionary to act as an adjacency list

    st= Stack.Stack()
    st.push(start)
    path = []

    while not st.is_empty():
        vertex = st.pop() 
        if vertex in path:
            continue
        path.append(vertex)
        for neighbor in graph[vertex]:
            st.push(neighbor)

    return path

