class ValidateSubsequence {

    fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
        var index = 0
        for (n in array) {
            if (index >= sequence.size) {
                break
            }
            if (n == sequence[index]) {
                index++
            }
        }
        return index == sequence.size
    }

}