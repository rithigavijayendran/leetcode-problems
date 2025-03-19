import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public void reverse(ArrayList<String> ans) {
        int i = 0;
        int j = ans.size() - 1;
        while (i < j) {
            String temp = ans.get(i);
            ans.set(i, ans.get(j));
            ans.set(j, temp);
            i++;
            j--;
        }
    }

    public String reverseWords(String s) {
        s = s.strip(); 
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder s1 = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) != ' ') {
                s1.append(s.charAt(i));
                i++;
            }
            if (s1.length() > 0) {
                ans.add(s1.toString()); 
                s1.setLength(0); 
            }

            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
        }

        reverse(ans);

        return String.join(" ", ans);
    }
}
