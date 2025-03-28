LL: Partition List ( ** Interview Question)
⚠️ CAUTION: Advanced Challenge Ahead!

This Linked List problem is significantly more challenging than the ones we've tackled so far. It's common for students at this stage to find this exercise demanding, so don't worry if you're not ready to tackle it yet. It's perfectly okay to set it aside and revisit it later when you feel more confident.

If you decide to take on this challenge, I strongly advise using a hands-on approach: grab a piece of paper and visually map out each step.

This problem requires a clear understanding of how elements in a Linked List interact and move. By now, you've observed numerous Linked List animations in the course, which have prepared you for this moment.

This exercise will be a true test of your ability to apply those concepts practically. Remember, patience and persistence are key here!

Now, here is the exercise:

___________________________________

You have a singly linked list that DOES NOT HAVE A TAIL POINTER  (which will make this method simpler to implement).

Given a value x you need to rearrange the linked list such that all nodes with a value less than x come before all nodes with a value greater than or equal to x.

Additionally, the relative order of nodes in both partitions should remain unchanged.

Constraints:
The solution should traverse the linked list at most once.
The solution should not create a new linked list.

Input:
A singly linked list and an integer x.

Output:
The same linked list but rearranged as per the above criteria.

Function signature:
public void partitionList(int x);

Details:
The function partitionList takes an integer x as a parameter and modifies the current linked list in place according to the specified criteria. If the linked list is empty (i.e., head is null), the function should return immediately without making any changes.

Example 1:
Input:
Linked List: 3 -> 8 -> 5 -> 10 -> 2 -> 1 x: 5
Process:
Values less than 5: 3, 2, 1
Values greater than or equal to 5: 8, 5, 10
Output:
Linked List: 3 -> 2 -> 1 -> 8 -> 5 -> 10


Example 2:
Input:
Linked List: 1 -> 4 -> 3 -> 2 -> 5 -> 2 x: 3
Process:
Values less than 3: 1, 2, 2
Values greater than or equal to 3: 4, 3, 5
Output:
Linked List: 1 -> 2 -> 2 -> 4 -> 3 -> 5


Tips:
While traversing the linked list, maintain two separate chains: one for values less than x and one for values greater than or equal to x.
Use dummy nodes to simplify the handling of the heads of these chains.
After processing the entire list, connect the two chains to get the desired arrangement.

Note:
The solution must maintain the relative order of nodes. For instance, in the first example, even though 8 appears before 5 in the original list, the partitioned list must still have 8 before 5 as their relative order remains unchanged.

Note:
You must solve the problem WITHOUT MODIFYING THE VALUES in the list's nodes (i.e., only the nodes' next pointers may be changed.)

====SOLUTION======
The partitionList method aims to rearrange nodes in a singly linked list based on a given integer value x.

Nodes with values less than x are moved before those with values greater than or equal to x.

The original relative order of the nodes is maintained.

Here's a more detailed breakdown of each part:

Check for Empty List:
if (head == null) return;
The first line of code checks whether the linked list is empty. If the head pointer is null, there's nothing to partition. The method immediately returns, avoiding any further computations.
Create Dummy Nodes:
Node dummy1 = new Node(0);
Node dummy2 = new Node(0);
Two dummy nodes are created with value 0. These act as temporary placeholders and make it easier to manage the two new lists being formed—one for nodes less than x and another for nodes greater than or equal to x.
Initialize Tracker Variables:
Node prev1 = dummy1;
Node prev2 = dummy2;
Two variables, prev1 and prev2, are initialized to point to the dummy nodes. These variables will help us keep track of the last nodes in each of our two new lists as we build them.
Initialize Current Node:
Node current = head;
A variable named current is initialized to point to the head of the list. This current node will be the starting point for our iteration through the linked list.
Iterate Through the List:
while (current != null) { ... }
A while loop is used to iterate through the original linked list. This loop will keep running until we reach the end of the list, signified by current becoming null.
Inside the Loop:
a. Nodes with Value Less Than x:
if (current.value < x) { ... }
If the current node's value is less than x, we append it to the end of the list being built by prev1.
b. Nodes with Value Greater or Equal to x:
else { ... }
If the current node's value is greater than or equal to x, we append it to the end of the list being built by prev2.
c. Move to Next Node:
current = current.next;
After deciding where the current node should be placed, we advance current to the next node in the list for the next iteration.
Mark End of Second List:
prev2.next = null;
After the while loop ends, we need to ensure that the end of the list managed by prev2 is properly marked. We set the next pointer of the last node to null.
Connect The Two Lists:
prev1.next = dummy2.next;
Now, we connect the two lists to form a single, partitioned list. The next pointer of the last node in the list tracked by prev1 is set to the first actual node in the list tracked by dummy2.
Update Head Pointer:
head = dummy1.next;
Finally, the head of the original list is updated to point to the first actual node in the list tracked by dummy1. This effectively completes the partitioning process.


Code with inline comments:

public void partitionList(int x) {
// Step 1: Check for an empty list.
// If the list is empty, there is nothing
// to partition, so we exit the method.
if (head == null) return;

    // Step 2: Create two dummy nodes.
    // These dummy nodes act as placeholders
    // to simplify list manipulation.
    Node dummy1 = new Node(0);
    Node dummy2 = new Node(0);
 
    // Step 3: Initialize pointers for new lists.
    // 'prev1' and 'prev2' will track the end nodes of
    // the two lists that are being created.
    Node prev1 = dummy1;
    Node prev2 = dummy2;
 
    // Step 4: Start with the head of the original list.
    Node current = head;
 
    // Step 5: Iterate through the original list.
    while (current != null) {
 
        // Step 6: Compare current node value with 'x'.
        // Nodes are partitioned based on their value
        // being less than or greater than/equal to 'x'.
 
        // Step 6.1: If value is less than 'x',
        // add node to the first list.
        if (current.value < x) {
            prev1.next = current;  // Link node to the end of the first list.
            prev1 = current;       // Update the end pointer of the first list.
        } else {
            // Step 6.2: If value is greater or equal,
            // add node to the second list.
            prev2.next = current;  // Link node to the end of the second list.
            prev2 = current;       // Update the end pointer of the second list.
        }
 
        // Move to the next node in the original list.
        current = current.next;
    }
 
    // Step 7: Terminate the second list.
    // This prevents cycles in the list.
    prev2.next = null;
 
    // Step 8: Connect the two lists.
    // The first list is followed by the second list.
    prev1.next = dummy2.next;
 
    // Step 9: Update the head of the original list.
    // The head now points to the start of the first list.
    head = dummy1.next;
}
