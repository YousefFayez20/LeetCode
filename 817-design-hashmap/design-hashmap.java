class MyHashMap {
    int size;
    int capacity;
    Pair[] map; 
    Pair DELETED = new Pair(-1, -1);
    public MyHashMap() {
        this.size =0;
        this.capacity = 10000;
        this.map = new Pair[capacity];
    }
    private int hash(int key){
        return key%capacity;
    }
    public void put(int key, int value) {
        int idx = this.hash(key);
        for(;;){
            if(map[idx] == null){
                map[idx] = new Pair(key,value);
                size++; 
                return;
            }else if(map[idx].key == key){
                map[idx].val = value;
                return;
            }
            idx +=1;
            idx = idx%capacity;
        }
    }
    
    public int get(int key) {
        int idx = hash(key);
        while(map[idx] != null){
            if(map[idx].key == key){
                return map[idx].val;
            }
            idx +=1;
            idx = idx%capacity;
        }
        return -1;
        
    }
    
    public void remove(int key) {
        int idx = hash(key);
        while (map[idx] != null) {
            if (map[idx] != DELETED && map[idx].key == key) {
                map[idx] = DELETED; // mark as deleted
                size--;
                return;
            }
            idx = (idx + 1) % capacity;
        }
    }
}
class Pair{
    int key,val;
    public Pair(int key, int val){
        this.key = key;
        this.val = val;
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */