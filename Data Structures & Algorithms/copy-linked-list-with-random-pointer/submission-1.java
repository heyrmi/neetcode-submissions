/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null; 

        // Map<Node, Node> map = new HashMap<>(); 

        // // Pass 1: create all copy nodes
        // Node curr = head;
        // while(curr != null) {
        //     map.put(curr, new Node(curr.val));
        //     curr = curr.next;
        // }

        // // Pass 2: wire next and random
        // curr = head;
        // while(curr != null) {
        //     map.get(curr).next = map.get(curr.next);
        //     map.get(curr).random = map.get(curr.random);
        //     curr = curr.next;
        // }

        // return map.get(head);

        // Pass 1: interweave: A -> A' -> B -> B' -> C -> C'
        Node curr = head; 
        while(curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next; 
            curr.next = copy; 
            curr = copy.next;  // jump to next original
        }

        // Pass 2: wire random on copy nodes 
        curr = head;
        while(curr != null) {
            if(curr.random != null) {
                // A -> A'.random = A.random -> X' where X' is the next copied elements
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next; // jump to next original
        }

        // Pass 3: seperate the two lists 
        curr = head;
        Node copyHead = head.next; 
        Node copyCurr = copyHead; 
        while(curr != null) {
            curr.next = curr.next.next; 
            copyCurr.next = (copyCurr.next != null) ? copyCurr.next.next : null;
            curr = curr.next;
            copyCurr = copyCurr.next;  
        }

        return copyHead;

    }
}










