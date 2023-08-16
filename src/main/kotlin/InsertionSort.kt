class InsertionSort {
    fun insertionSort(arr: MutableList<Int>) : List<Int> {
        //Iterate through each item in array
        for( i in 0..<arr.size) {
            val value = arr[i]
            var j = i - 1
            //Uses the while loop for comparison
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j]
                j--
            }
            arr[j + 1] = value
        }
        return arr
    }
}