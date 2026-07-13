/**
 * @param {number} init
 * @return {{increment: Function, decrement: Function, reset: Function}}
 */
var createCounter = function(init) {

    let current = init;

    return {
        increment() {
            current++;
            return current;
        },

        decrement() {
            current--;
            return current;
        },

        reset() {
            current = init;
            return current;
        }
    };
};