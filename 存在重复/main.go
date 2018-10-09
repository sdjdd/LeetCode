package main

import (
	"fmt"
)

func main() {
	tests := [][]int{
		[]int{1, 2, 3, 1},
		[]int{1, 2, 3, 4},
		[]int{1, 1, 1, 3, 3, 4, 3, 2, 4, 2},
	}
	for _, t := range tests {
		fmt.Printf("%v = %t\n", t, containsDuplicate(t))
	}
}

func containsDuplicate(nums []int) bool {
	myMap := make(map[int]struct{})
	for _, v := range nums {
		if _, ok := myMap[v]; ok {
			return true
		}
		myMap[v] = struct{}{}
	}
	return false
}
