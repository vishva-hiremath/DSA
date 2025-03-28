**Linked List Summary:**

Linked list always links to the next element.
It will have head and tail pointing towards first and last nodes respectively.

**Different Methods**
1. Get
2. Set
3. Insert
4. RemoveFirst
5. RemoveLast
6. Append
7. Prepend
8. Reverse - Create references to three nodes, before, temp(current) and after. Reverse the next reference.

**Leet Codes:**
1. FindMiddleNode - Use tortoise and Hare algorithm. This is also called fast and slow pointers. Fast pointer moves two nodes at a time and slow node moves only one node at a time. By the time fast time reaches the final node or null, the slow pointer would have reached the middle node. So this will be middle node.
2. HasLoop - Use above algorithm - if it has loop, both slow and fast pointers will eventually meet at some point.
3. findKthNode from end - Use above algorithm. Point the fast node to start+kth Node and slow node at the start. When the fast node reaches the end, slow node would have reached the kTH node from the end.
4. PartitionList - Create two Node - smallNode and bigNode. Store all small values in smallNode and big values in BigNode. Connect the smallNode.next to the bigNode and bigNode.Next = null.
5. Remove Duplicates - Use hashSet to implement. HashSet won’t store duplicates.
6. Binary to Decimal -  Starting from the head of the linked list (the leftmost binary digit), iterate through each node until the end. For every node, double the current value of num (this is analogous to shifting in binary representation). Then, add the binary digit of the current node.
7. Reverse Between(start index and end index) - We have to keep track of the "previousNode," "currentNode,”(this is start index) and "nodeToMove" nodes to make sure we don't lose any nodes while reversing them. Update currentNode.next = nodetoMove.next, nodetoMove.next = previousNode.Next, PreviousNode.Next = NodetoMove
