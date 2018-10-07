package main

import "fmt"

func main() {
	nums := []int{1, 2, 3, 4, 5, 6, 7}
	k := 3
	fmt.Printf("nums = %v\nk = %d\n", nums, k)
	rotate(nums, k)
	fmt.Println(nums)
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
