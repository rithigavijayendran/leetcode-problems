class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;  
        StringBuilder ans = new StringBuilder();  
        
        int n1 = word1.length();
        int n2 = word2.length();
        
        while (i < n1 && j < n2) { 
            ans.append(word1.charAt(i++));
            ans.append(word2.charAt(j++));
        }
        
        while (i < n1) {  
            ans.append(word1.charAt(i++));
        }
        
        while (j < n2) {  
            ans.append(word2.charAt(j++));
        }
        
        return ans.toString();  
    }
}
