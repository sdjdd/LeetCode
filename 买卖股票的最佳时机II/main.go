package main

import (
	"fmt"
)

func main() {
	tests := [][]int{
		[]int{7, 1, 5, 3, 6, 4},
		[]int{1, 2, 3, 4, 5},
		[]int{7, 6, 4, 3, 1},
	}
	for _, t := range tests {
		fmt.Printf("%v = %d\n", t, maxProfit(t))
	}
}

func maxProfit(prices []int) int {
	if len(prices) == 0 {
		return 0
	}
	var earn, buy int
	own := false
	price := prices[0]
	for _, p := range prices {
		if p > price && !own {
			buy = price
			own = true
		} else if p < price && own {
			earn += price - buy
			own = false
		}
		price = p
	}
	if own {
		earn += price - buy
	}
	return earn
}
