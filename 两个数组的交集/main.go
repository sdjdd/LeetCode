package main

import "fmt"

func main() {
	tests := []struct {
		num1, num2 []int
	}{
		{[]int{1, 2, 2, 1}, []int{2, 2}},
		{[]int{4, 9, 5}, []int{9, 4, 9, 8, 4}},
	}
	for _, t := range tests {
		fmt.Printf("nums1 = %v, nums2 = %v\n", t.num1, t.num2)
		fmt.Printf("\t%v\n", intersect(t.num1, t.num2))
	}
}

func intersect(nums1 []int, nums2 []int) []int {
	var myMap = make(map[int]int)
	var result []int
	for _, v := range nums1 {
		myMap[v]++
	}
	for _, v := range nums2 {
		if myMap[v] > 0 {
			result = append(result, v)
			myMap[v]--
		}
	}
	return result
}
