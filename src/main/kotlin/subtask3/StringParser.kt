package subtask3

class StringParser {

    val bracketsArray: CharArray = charArrayOf('(', '<', '[')

    fun getResult(inputString: String): Array<String> {
        val result: ArrayList<String> = arrayListOf()
        inputString.forEachIndexed { index, ch -> if (ch in bracketsArray) result.add( findSubString(inputString, index) ) }
        return result.toTypedArray()
    }

    fun findSubString(inputString: String, index: Int): String {
        val chars: ArrayList<Char> = arrayListOf()
        val ch: Char = inputString[index]
        var count = 0
        var i = index + 1

        while (count >= 0){
            chars.add(inputString[i++])
            if (inputString[i] == whatIsClosing(ch)) {
                count--
            }
            if (inputString[i] in bracketsArray){
                if (ch == inputString[i]){
                    count++
                }
                findSubString(inputString, i)
            }
        }
        return chars.joinToString("")
    }

    fun whatIsClosing(ch: Char): Char{
        return when(ch) {
            '(' -> ')'
            '[' -> ']'
            '<' -> '>'
            else -> ' '
        }
    }
}
