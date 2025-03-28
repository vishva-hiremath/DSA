**My Method:**
public void reverseBetween(int start, int end) {
if(start == end || head == null) return;
Node current = head;
Node beforeStartNode = null;
Node afterEndNode = null;
Node startNode = null;
Node endNode = null;
int currentIndex = 0;
Node previous = null;
while(current != null) {
if(currentIndex == start) {
beforeStartNode = previous;
//beforeStartNode.next = null;
startNode  = current;
}
if(currentIndex == end) {
endNode = current;
afterEndNode = endNode.next;
endNode.next = null;
}

           previous = current;
           current = current.next;
           currentIndex++;
        }

        Node temp = startNode;
        startNode = endNode;
        endNode = temp;
        Node after = temp.next;
        Node before = null;

        while(temp != null) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
        if(beforeStartNode != null) beforeStartNode.next = startNode;
        endNode.next = afterEndNode;
        head = startNode;
    }
**END**END**END**

Given the list:
1 → 2 → 3 → 4 → 5.

With 0-based indexing, our goal is: Reverse nodes between indices 1 and 3 (inclusive) to achieve the result:
1 → 4 → 3 → 2 → 5.

Detailed Walkthrough:

Preliminary Steps:
Check if the list is empty:
if (head == null) return;
We return right away if there's nothing in the list to reverse.

Create a dummy node:
Node dummyNode = new Node(0);
dummyNode.next = head;
The dummy node is a helper to simplify our code, especially if we have to reverse starting from the very first node.

Preparation:
Move to the node right before the start of the reversal:
Node previousNode = dummyNode;
for (int i = 0; i < startIndex; i++) {
previousNode = previousNode.next;
}
In this case, for reversal starting at index 1, prev will now point to node 1 (at index 0).

Position current at the beginning of the reversal section:
Node currentNode = previousNode.next;
So, currentNode now points to node 2, marking the start of our reversal.

The Core Loop:
Perform the node reversal between m and n:
for (int i = 0; i < endIndex - startIndex; i++) {
Node nodeToMove = currentNode.next;
currentNode.next = nodeToMove.next;
nodeToMove.next = previousNode.next;
previousNode.next = nodeToMove;
}

Using our example, where we reverse nodes from indices 1 through 3:
First iteration (Reversing node at index 2, i.e., node 3):
nodeToMove = currentNode.next: Now, nodeToMove points to node 3.
currentNode.next = nodeToMove.next: Node 2 (our currentNode) now directs to node 4, leaving out node 3. Intermediate State: 1 → 2 → 4 → 5. Node 3 (nodeToMove) stands alone.
nodeToMove.next = previousNode.next: Node 3 (nodeToMove) links to node 2.
previousNode.next = nodeToMove: Node 1 (previousNode) connects to node 3. Result:
1 → 3 → 2 → 4 → 5.
Second iteration (Reversing node at index 3, i.e., node 4):
nodeToMove = currentNode.next: nodeToMove now points at node 4.
currentNode.next = nodeToMove.next: Node 2 now shifts to node 5, skipping node 4. Intermediate State: 1 → 3 → 2 → 5. Node 4 (nodeToMove) is free.
nodeToMove.next = previousNode.next: Node 4 (nodeToMove) links to node 3.
previousNode.next = nodeToMove: Node 1 (previousNode) connects to node 4. Result:
1 → 4 → 3 → 2 → 5.
Our target reversed order!

Finalization:
Realign the list head:
head = dummyNode.next;
If the original first node was part of our reversal, this ensures the head now rightly points to the list's beginning.

If you are having a hard time grasping this, I recommend illustrating with diagrams or using physical blocks and arrows which can oftentimes make it clearer.

Also, it might help to check the "Code with inline comments" below: