class LRUCache {
    private static class Node {
        int key, value; 
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    private final int capacity; 
    private final Map<Integer, Node> map; 
    private final Node head; 
    private final Node tail; 

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>(); 

        // connect the head and tails to together (each value will be in between them)
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) {
            return -1; 
        }

        Node node = map.get(key);
        // mark most recently used
        moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            // key present: update the value
            Node node = map.get(key);
            node.value = value;
            moveToHead(node);
        } else {
            // the key does not exist (new key)
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addAfterHead(newNode);

            if(map.size() > capacity) {
                Node lru = tail.prev; 
                removeNode(lru);
                map.remove(lru.key);
            }
        }
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addAfterHead(node);
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
}
