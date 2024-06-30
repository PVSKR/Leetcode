class TimeMap {

    Map<String, List<Pair<String, Integer>>> map;
    
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)) map.put(key, new ArrayList<>());
        map.get(key).add(new Pair(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<Pair<String, Integer>> list = map.get(key);
        int l=0, r = list.size() - 1;
        while(l<r) {
            int mid = l+(r-l+1)/2;
            if(list.get(mid).getValue() <= timestamp) l=mid;
            else r = mid-1;
        }
        return list.get(l).getValue() <= timestamp ? list.get(l).getKey() : "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */