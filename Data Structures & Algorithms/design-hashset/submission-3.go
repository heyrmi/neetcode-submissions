type MyHashSet struct {
	present []bool
}

func Constructor() MyHashSet {
    return MyHashSet {
		present: make([]bool, 1000001),
	}
}

func (this *MyHashSet) Add(key int) {
    this.present[key] = true
}

func (this *MyHashSet) Remove(key int) {
	this.present[key] = false
}

func (this *MyHashSet) Contains(key int) bool {
    return this.present[key]
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Add(key);
 * obj.Remove(key);
 * param_3 := obj.Contains(key);
 */
 