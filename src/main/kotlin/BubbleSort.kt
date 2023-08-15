class BubbleSort {
    fun bubbleSort(arr: MutableList<Int>): List<Int> {
        // Takes in a mutable list of int : returns another list of int
        val arrLength = arr.size
        //outer loop
        for (i in 0 until arrLength - 1) {
            //inner loop
            for (j in 0 until arrLength - i - 1) {
                //comparison happening
                if (arr[j] > arr[j + 1]) {
                    //temp variable for swap
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
            }
        }
        return arr
    }
}