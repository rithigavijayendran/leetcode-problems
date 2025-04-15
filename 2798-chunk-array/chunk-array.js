/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let n = arr.length
    let res = []
    for(let i=0;i<n;i+=size){
        res.push(arr.slice(i,Math.min(i+size,n)));
    }
    return res;
};
