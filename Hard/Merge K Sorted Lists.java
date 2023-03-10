/*
Given K sorted linked lists of equal sizes. The task is to merge them in such a way that after merging they will be a single sorted linked list.

Input Format
First line contains 2 space separated integers K and N.
Next lines contain N*K space separated integers

Constraints
None

Output Format
Single line consisting of space separated numbers

Sample Input
3 4
5 5 5 9 3 13 14 17 1 8 11 18 
Sample Output
1 3 5 5 5 8 9 11 13 14 17 18 
*/

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();

        Node[] lists = new Node[k];
        for (int i = 0; i < k; i++) {
            Node head = null;
            Node tail = null;
            for (int j = 0; j < n; j++) {
                int data = scanner.nextInt();
                Node node = new Node(data);
                if (head == null) {
                    head = node;
                    tail = node;
                } else {
                    tail.next = node;
                    tail = node;
                }
            }
            lists[i] = head;
        }

        Node mergedList = mergeKLists(lists);
        while (mergedList != null) {
            System.out.print(mergedList.data + " ");
            mergedList = mergedList.next;
        }
    }

    static Node mergeKLists(Node[] lists) {
        int k = lists.length;
        PriorityQueue<Node> pq = new PriorityQueue<>(k, new Comparator<Node>() {
            public int compare(Node a, Node b) {
                return a.data - b.data;
            }
        });

        for (int i = 0; i < k; i++) {
            if (lists[i] != null) {
                pq.add(lists[i]);
            }
        }

        Node dummy = new Node(0);
        Node tail = dummy;

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            tail.next = node;
            tail = node;
            if (node.next != null) {
                pq.add(node.next);
            }
        }

        return dummy.next;
    }
}
