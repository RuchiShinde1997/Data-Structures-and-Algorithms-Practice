package arrays

// Q. Subarray sum = k
func subarraySum(nums []int, k int) int {
    prefixSum := 0
    count := 0
    m := map[int]int{0:1}
    for _, num := range nums {
        prefixSum += num
        if val, ok := m[prefixSum-k]; ok {
            count += val
        }
        m[prefixSum] += 1
    }

    return count
}