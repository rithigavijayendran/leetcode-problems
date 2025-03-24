class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        int i=0;
        int j=0;
        while(j<n2){
            if(i<n1 && s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==n1;
    }
}