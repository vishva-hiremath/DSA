Stacks:
Last In- First Out
Use Linked list to implement this.
Top will be the first Node in the linked list and height will be the number of nodes.
Push: Insert the Node at the top/head of linked list
Pop: Remove the Node at the top/head of the linked list.

LeetCodes:
1. Stack push using arrayList - Insert the Node at the end.
2. Stack pop using arrayList - Remove the Node at the end.
3. Stack reverseString - Use pop method and store it in another string.
4. Stack: Balanced Parentheses - if its opening brace, push it to stack and pop it from the stack if it’s the closing brace. If the stack is empty at the end then it’s reverse string.
5. Stack: Sort stack in ascending order - Create an additional stack, pop the first element from the original stack, store it in temp variable and compare it with top element in additional stack if its not empty, if temp value is less than the top element in additional stack. Move all the elements from additional stack to original stack, move the temp value to additional stack. Repeat this process until original stack becomes empty. Then all the elements will be descending order in additional stack, move these elements to original stack which will become ascending order.