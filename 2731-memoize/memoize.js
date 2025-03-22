/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    const cache = new Map();

    return function(...args) {
        const ans = args.toString();
        if (cache.has(ans)) {
            return cache.get(ans);
        } else {
            const result = fn (...args);
            cache.set(ans, result);
            return result
        }
    }
}