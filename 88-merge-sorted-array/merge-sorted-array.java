class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0; 
        int j = 0; 
        int k = 0; 
        
        int[] res = new int[m + n]; 
        
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                res[k++] = nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }
        
        while (i < m) {
            res[k++] = nums1[i++];
        }
        
        while (j < n) {
            res[k++] = nums2[j++];
        }
        
        for (int p = 0; p < res.length; p++) {
            nums1[p] = res[p];
        }
    }
}