class TwoNumberSum {

    //    array = [-4, -1, 1, 3, 5, 6, 8, 11]
    fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
        array.sort()
        var left = 0
        var right = array.size - 1

        while (left < right) {
            val currentSum = array[left] + array[right]
            if (currentSum == targetSum) {
                return listOf(array[left], array[right])
            } else if (currentSum < targetSum) {
                left++
            } else {
                right--
            }
        }
        return listOf<Int>()
    }

}