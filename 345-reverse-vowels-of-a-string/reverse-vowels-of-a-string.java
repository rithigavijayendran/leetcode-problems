class Solution {
    public String reverseVowels(String s) {
        char[] ans = s.toCharArray();
        int left = 0;
        int right = ans.length-1;
        String vowels = "AEIOUaeiou";
        while(left<right){
            while(left<right && vowels.indexOf(ans[left])==-1){
                left++;
            }
            while(left<right && vowels.indexOf(ans[right])==-1){
                right--;
            }
            char temp = ans[left];
            ans[left] = ans[right];
            ans[right] = temp;
            left++;
            right--;
        }
        return new String(ans);
    }
}