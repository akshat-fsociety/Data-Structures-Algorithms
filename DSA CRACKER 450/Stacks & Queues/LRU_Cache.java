// https://practice.geeksforgeeks.org/problems/lru-cache/1

class LRUCache {
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    HashMap<Integer, Node>hm = new HashMap<>();
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
            Node node = hm.get(key);
            remove(node);
            insert(node);
            return node.value;
        }else{
            return -1;
        }
    }
    
    public void set(int key, int value) {
        if(hm.containsKey(key)){
            remove(hm.get(key));
        }
        if(hm.size()==capacity){
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }
    
    private void remove(Node node){
        hm.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    private void insert(Node node){
        hm.put(node.key,node);
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        headNext.prev = node;
        node.next = headNext;
    }
    
    class Node{
        int key, value;
        Node next, prev;
        Node(int _key, int _value){
            key = _key;
            value = _value;
        }
    }
}
