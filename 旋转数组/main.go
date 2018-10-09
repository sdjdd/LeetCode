package main

import "fmt"

func main() {
	tests := []struct {
		nums []int
		k    int
	}{
		{[]int{1, 2, 3, 4, 5, 6, 7}, 3},
		{[]int{-1, -100, 3, 99}, 2},
	}
	for _, t := range tests {
		fmt.Printf("%v, k = %d\n\t=> ", t.nums, t.k)
		rotate(t.nums, t.k)
		fmt.Println(t.nums)
	}
}

func rotate(nums []int, k int) {
	len := len(nums)
	if k == 0 || len == 0 {
		return
	}
	k = k % len
	reverse(nums)
	reverse(nums[:k])
	reverse(nums[k:])
}

func reverse(nums []int) {
	len := len(nums)
	for i, j := 0, len-1; i < j; i, j = i+1, j-1 {
		nums[i], nums[j] = nums[j], nums[i]
	}
}
