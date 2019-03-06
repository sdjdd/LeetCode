package solution

func sumEvenAfterQueries(A []int, queries [][]int) []int {
	answer := make([]int, len(A))
	evenSum := 0
	for _, num := range A {
		if num%2 == 0 {
			evenSum += num
		}
	}
	for i, pair := range queries {
		val, index := pair[0], pair[1]
		num := A[index]
		sum := num + val
		A[index] = sum
		if sum%2 == 0 {
			if num%2 == 0 {
				evenSum += val
			} else {
				evenSum += sum
			}
		} else if num%2 == 0 {
			evenSum -= num
		}
		answer[i] = evenSum
	}
	return answer
}
