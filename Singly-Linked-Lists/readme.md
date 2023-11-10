# 8.26 Singly Linked List
Your job is to make a singly linked list. You will complete the files SinglyLinkedNode.java and SinglyLinkedList.java. 
Notice, these are inherited from abstract classes, AbstractSinglyLinkedNode.java and AbstractSinglyLinkedList.java.
The abstract classes show the methods you need to finish. All indexing for the list methods start at 0 and go through length - 1. 
There is also a main test program for your use. If you run this in terminal mode, you will see a menu of items that you can run repeatedly to test on your own. 
The menu will look like the following when you run the provided TestSinglyLinkedList.java:

1 : Adds a node at a specified index
2 : Adds a node to the end of the list
3 : Adds a node to the front of the list
4 : Clear the list (remove all nodes)
5 : Removes the node at a specified index
6 : Removes the first instance of a node
7 : sets the node at a specified index to a new node
8 : returns the number of nodes in the list
9 : Print the list
10 : quit
You may not use an array or ArrayList for this assignment.
A linked list is an alternative to these data structures, so using them would be missing the point entirely.

Your solution should be able to take any data type as a generic parameter.
This parameter specifies what sort of data is stored in your nodes.
Thus writing your class definitions (public class … { ) correctly for SinglyLinkedList and SinglyLinkedNode is very important.
