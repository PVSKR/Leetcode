class LRUCache {

    private Map<Integer, Node> cache;
    private int capacity;
    private Node left;
    private Node right;

    public LRUCache(int capacity) {
        cache = new HashMap<>();
        this.capacity = capacity;

        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next = this.right;
        this.right.back = this.left;
        
    }
    
    public int get(int key) {
        if(cache.containsKey(key)) {
            remove(cache.get(key));
            insert(cache.get(key));
            return cache.get(key).val;
        }
        else return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)) {
            remove(cache.get(key));
        }
        cache.put(key, new Node(key, value));
        insert(cache.get(key));

        if(cache.size() > capacity) {
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }

    public void remove(Node node) {
        Node prev = node.back;
        Node next = node.next;

        prev.next = next;
        next.back = prev;
    }

    public void insert(Node node) {
        Node prev = this.right.back;
        Node next = this.right;

        prev.next = node;
        next.back = node;

        node.next = next;
        node.back = prev;
    }
    
    private class Node {
        private int key;
        private int val;

        Node next;
        Node back;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */