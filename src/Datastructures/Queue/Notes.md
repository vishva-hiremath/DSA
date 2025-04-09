Queue:
First In- First Out
Use linked list to implement this.
First, last and length.
First will be head and last will be tail.
Enqueue: Insert the node at the last and map it to tail
Dequeue: Remove the node from the first node and map removed node.next from temp variable to first and removedNode.next to null

LeetCodes:
1. Enqueue using arrayList using two stacks- We can do this by using two stacks. Move all the elements from stack1 to stack2 and insert the new element into stack1 and copy all the elements from stack2 to stack1. This will make the inserted element at the last.
2. Dequeue using arrayList - Pop the element from the stack1 