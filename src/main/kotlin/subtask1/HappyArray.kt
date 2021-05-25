package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val result = sadArray.toMutableList()
        var i = 1
        while (i < (result.size - 1)) {
            if ((result[i-1] + result[i+1]) < result[i]) {
                result.removeAt(i)
                if(i > 1) i--
            }
            else {
                i++
            }
        }
        return result.toIntArray()
    }
}
