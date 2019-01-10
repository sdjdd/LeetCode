/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var nextGreaterElement = function(nums1, nums2) {
    var map = new Map();
    var stack = [];
    nums2.forEach(n => {
        while (stack.length > 0 && n > stack[stack.length - 1])
            map.set(stack.pop(), n);
        stack.push(n);
    });
    for (var i = 0; i < nums1.length; i++) {
        if (map.has(nums1[i]))
            nums1[i] = map.get(nums1[i]);
        else
            nums1[i] = -1;
    }
    return nums1
};