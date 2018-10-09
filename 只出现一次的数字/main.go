package main

import (
	"fmt"
)

func singleNumber(nums []int) int {
	for i := 1; i < len(nums); i++ {
		nums[0] ^= nums[i]
	}
	return nums[0]
}

func main() {
	tests := [][]int{
		[]int{2, 2, 1},
		[]int{4, 1, 2, 1, 2},
	}
	for _, t := range tests {
		fmt.Printf("%v = %d\n", t, singleNumber(t))
	}
}
