class Solution {
    public boolean ispresent(int key,int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>(); 
        int n1 = nums1.length;
        int n2 = nums2.length;
        for(int i=0;i<n1;i++){
            if(!ispresent(nums1[i],nums2) && !ans1.contains(nums1[i])){
                ans1.add(nums1[i]);
            }
        }
        for(int i=0;i<n2;i++){
            if(!ispresent(nums2[i],nums1) && !ans2.contains(nums2[i])){
                ans2.add(nums2[i]);
            }
        }
        ans.add(ans1);
        ans.add(ans2);
        return ans;

    }
}