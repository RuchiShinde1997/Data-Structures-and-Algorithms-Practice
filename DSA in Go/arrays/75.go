package arrays

func sortColors(nums []int)  {
    low := 0
	mid := 0
	high := len(nums)-1

	while(mid <= high){
		if nums[mid] == 0 {
			swap(nums, mid, low)
			low++
			mid++
		} else if nums[mid] == 1 {
			mid++
		} else {
			swap(nums, mid, high)
			high--
		}
	}
}

// swaps the slice elements at the given indices
func swap(nums []int, i, j int) {
    nums[i], nums[j] = nums[j], nums[i]
}