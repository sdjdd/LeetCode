package main

import (
	"fmt"
)

func main() {
	nums := []int{1, 1, 2}
	fmt.Println(nums)
	l := removeDuplicates(nums)
	fmt.Println(nums[:l])
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
