class Solution {
    fun romanToInt(s: String): Int {
        val len = s.length
        val numbers = Array<Int>(len) { 0 }
        for (i in 0 until len) {
            numbers[i] = map(s[i])
        }
        var sum = 0
        var j = len - 1
        do {
            if (j == 0) {
                sum += numbers[j]
                break
            }
            if (numbers[j] <= numbers[j - 1]) {
                sum += numbers[j]
            } else {
                sum = sum + numbers[j] - numbers[j - 1]
                j -= 1
            }
            j -= 1
        } while (j >= 0)
        return sum
    }
    
    fun map(s: Char) = when(s) {
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 1
    }
}