class Queue:
    """(FIFO) queuing policy implemented using python list."""

    def __init__(self):
        self.list = []

    def enqueue(self, item):
        """Push 'item' onto the queue."""
        self.list.append(item)

    def dequeue(self):
        """remove the first element from the queue."""
        return self.list.pop(0)

    def top(self):
        """Return the last queue."""
        return self.list[-1]

    def is_empty(self):
        """Returns true if the queue is empty."""
        return len(self.list) == 0
