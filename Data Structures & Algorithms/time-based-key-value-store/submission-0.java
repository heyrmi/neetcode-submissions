class TimeMap {

    private Map<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<>(); 
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
        // the above method is same as writing as 
        // if(!map.containsKey(key)) {
        //     treeMap = new TreeMap<>(); 
        //     map.put(key, treeMap);
        // } else 
        //     treeMap = map.get(key);
        // treeMap.put(timeStamp, value);
    }
    
    public String get(String key, int timestamp) {
        
        if(!map.containsKey(key)) return "";

        Integer floor = map.get(key).floorKey(timestamp);

        // String result;
        // if(floor == null) 
        //     result = "";
        // else 
        //     result = map.get(key).get(floor);
        // return result;

        return floor == null ? "" : map.get(key).get(floor);
    }
}

