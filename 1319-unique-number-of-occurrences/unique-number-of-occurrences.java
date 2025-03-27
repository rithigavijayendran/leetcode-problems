class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int it:hm.values()){
            hs.add(it);
        }
        return hm.size() == hs.size();
        
    }
}