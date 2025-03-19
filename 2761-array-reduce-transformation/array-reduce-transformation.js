/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let ans=0;
    if(nums.length==0){
        return init;
    }
    for(let i=0;i<nums.length;i++){
        let t=fn(init,nums[i]);
        ans=t;
        init = t;
    }
    return ans;
};