package main

import (
	"fmt"
)

func main() {
	tests := []struct {
		nums []int
		k    int
	}{
		{[]int{3, 2, 1, 5, 6, 4}, 2},
		{[]int{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4},
	}
	for _, t := range tests {
		fmt.Printf("nums = %v, k = %d\n\t%d\n",
			t.nums, t.k, findKthLargest(t.nums, t.k))
	}
}

func findKthLargest(nums []int, k int) int {
	begin := 0
	end := len(nums) - 1
	for {
		i := begin
		key := nums[end]
		for j := i; j < end; j++ {
			if nums[j] > key {
				nums[i], nums[j] = nums[j], nums[i]
				i++
			}
		}
		nums[i], nums[end] = nums[end], nums[i]
		if i == k-1 {
			return nums[i]
		} else if i < k-1 {
			begin = i + 1
		} else {
			end = i - 1
		}
	}
}
