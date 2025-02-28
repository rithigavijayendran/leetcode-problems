class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, ArrayList<String>> x = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            int[] y = new int[26];
            for(int j=0;j<strs[i].length();j++)
            {
                int p = strs[i].charAt(j)-97;
                y[p]++;
            }
            StringBuilder s = new StringBuilder("");
            for(int j=0;j<y.length;j++)
            {
                s.append(y[j]);
                s.append("#");
            }
            ArrayList<String> o = x.getOrDefault(s.toString(),new ArrayList<String>());
            o.add(strs[i]);
            x.put(s.toString(),o);
        }
        for(Map.Entry<String,ArrayList<String>> entry : x.entrySet())
        {
            ans.add(entry.getValue());
        }
        return ans;
    }
}