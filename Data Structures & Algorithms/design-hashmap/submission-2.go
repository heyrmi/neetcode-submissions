type MyHashMap struct {
	values []int
}

func Constructor() MyHashMap {
    values := make([]int, 1000001)

	for i := range values {
		values[i] = -1
	}

	return MyHashMap{values}
}

func (this *MyHashMap) Put(key int, value int) {
    this.values[key] = value
}

func (this *MyHashMap) Get(key int) int {
    return this.values[key]
}

func (this *MyHashMap) Remove(key int) {
	this.values[key] = -1
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Put(key,value);
 * param_2 := obj.Get(key);
 * obj.Remove(key);
 */