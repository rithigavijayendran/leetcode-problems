class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        Boolean temans = true;
        int max=0;
        for(int i=0;i<candies.length;i++){
            max = candies[i]+extraCandies;
            for(int j=0;j<candies.length;j++){
                if(candies[j]==max){
                    continue;
                }
                if(candies[j]>max){
                    temans = false;
                    break;
                }
                else{
                    temans = true;
                }
            }
            ans.add(temans);
        }
        return ans;
    }
}