class LRUCache {

    private static class Node {
        int key, value; // key value
        Node prev, next; // pointers

        Node(int key, int value) {
            this.key = key;
            this.value = value; 
            this.prev = null;
            this.next = null;
        }
    }

    private final int capacity; 
    private final Map<Integer, Node> map; 
    private final Node head; //dummy - left boundary will determine most usage
    private final Node tail; //dummy - right boundary will determine least usage

    public LRUCache(int capacity) {
        this.capacity = capacity; 
        this.map = new HashMap<>(); 

        // wire dummy head and tail
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head; 
    }
    
    // This is the main APIs
    public int get(int key) {
        if(!map.containsKey(key)) {
            return -1; 
        } 

        Node node = map.get(key);
        moveToHead(node); // mark it as most recently used
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            moveToHead(node); // mark it as most recently used
        } else {
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addAfterHead(newNode); // add it to head for most recently used 

            // also remove 
            if(map.size() > capacity) {
                Node lru = tail.prev; // least recetly used will be just before tail node
                removeNode(lru);      // unlink from Doubly linked list
                map.remove(lru.key);  // remove from hashmap too      
            }
        }    
    }


    private void removeNode(Node node) {
        node.prev.next = node.next; 
        node.next.prev = node.prev;
    }

    private void addAfterHead(Node node) {
        node.next = head.next; 
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addAfterHead(node);
    }

}
