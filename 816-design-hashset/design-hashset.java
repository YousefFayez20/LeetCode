class Value{
    int val;
    int deleted;
    public Value(int val){
        this.val = val;
    }
}

class MyHashSet {
    int capacity;
    Value[] values;
    int size;
    public MyHashSet() {
        this.capacity = 1000000;
        this.values = new Value[capacity];
        this.size =0;
    }
    public void add(int key) {
        int index = key%capacity;
        while(true){
            if(values[index] == null  ||values[index].deleted == -1 ){
                values[index] = new Value(key);
                return;
            }else if(values[index].val == key){
                return;
            }
            index++;
            index = index%capacity;
        }
        
    }
    
    public void remove(int key) {
        int idx = key%capacity;
        while(values[idx] != null){
            if(values[idx].deleted != -1 && values[idx].val == key){
                values[idx].deleted = -1;
            }
            idx++;
            idx = idx%capacity;
        }
    }
    
    public boolean contains(int key) {
         int idx = key%capacity;
        while(values[idx] != null){
            if(values[idx].deleted != -1 && values[idx].val == key){
                return true;
            }
            idx++;
            idx = idx%capacity;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */