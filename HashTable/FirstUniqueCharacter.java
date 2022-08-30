class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character, Count> map = new LinkedHashMap <Character, Count>();
        
        for (int index = 0; index < s.length(); index++) {
            char t = s.charAt (index);
            if (!map.containsKey (t)) {
                map.put (t, new Count (index, 0));
            }
            
            Count temp = map.get (t);
            temp.count = (temp.count) + 1;
            map.put (t, temp);
        }
        
        
        for (Map.Entry <Character, Count> entry : map.entrySet()) {
            if (entry.getValue().count == 1) {
                return entry.getValue().index;
            }
        }
        
        return -1;
    }
}

class Count {
    int index;
    int count;

    Count (int index, int count) {
        this.index = index;
        this.count = count;
    }
}