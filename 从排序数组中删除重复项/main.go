package main

import (
	"fmt"
)

func main() {
	tests := [][]int{
		[]int{1, 1, 2},
		[]int{0, 0, 1, 1, 1, 2, 2, 3, 3, 4},
	}
	for _, t := range tests {
		fmt.Printf("%v => %v\n", t, t[:removeDuplicates(t)])
	}
}

func removeDuplicates(nums []int) int {
	len := len(nums)
	if len < 2 {
		return len
	}
	j := 1
	for i := 1; i < len; i++ {
		if nums[i] != nums[i-1] {
			nums[j] = nums[i]
			j++
		}
	}
	return j
}
