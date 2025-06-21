package arrays

// Q. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

func twoSum(nums []int, target int) []int {
    m := map[int]int{}
    for i := range nums{
        diff := target - nums[i]
        if idx, ok := m[diff]; ok {
            return []int{idx, i}
        } else {
            m[nums[i]] = i
        }
    }
    return []int{-1, -1}
}