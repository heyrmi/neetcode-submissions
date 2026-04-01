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

        Map<Node, Node> map = new HashMap<>(); 

        // Pass 1: create all copy nodes
        Node curr = head;
        while(curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // Pass 2: wire next and random
        curr = head;
        while(curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }
}










