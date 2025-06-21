package arrays

// Q. Check if the arrays are sorted and rotated.
func check(nums []int) bool {
	drop := 0
    n := len(nums)
	for i := range nums {
        // check if the current value is greater than the next one.
        // in case of the last index of the array, compare it with the 0th index.
		if nums[i] > nums[(i+1)%n] {
			drop++
		}
	}

	if drop > 1 {
		return false
	}

	return true
}