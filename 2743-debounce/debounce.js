/**
 * @param {Function} fn
 * @param {number} t milliseconds
 * @return {Function}
 */
var debounce = function(fn, t) {
    let to;
    return function(...args) {
        clearTimeout(to);
        to = setTimeout(() => {
            fn.apply(this, args);
        }, t);
    };
};