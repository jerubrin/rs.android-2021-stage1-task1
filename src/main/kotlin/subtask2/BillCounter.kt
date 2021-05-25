package subtask2

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var toReturn: Int = b * 2
        bill.forEachIndexed{i, cnt -> if (i != k) toReturn-=cnt}
        return if (toReturn == 0) "Bon Appetit" else (toReturn/2).toString()
    }
}
