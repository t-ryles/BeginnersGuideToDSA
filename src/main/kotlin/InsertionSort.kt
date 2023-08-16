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

/**
 * Notes:
 * Nested while loop within for loop.
 * For Loop - to loop through each element in array.
 * While Loop - to compare left [j] to right [i] element and swap if false.
 * If true, left [j] = value and right [i] is incremented by 1 from for loop.
 * Value keep track of the right [i] value in the while loop.
 *
 * When to use: when data is nearly sorted O(n) time complexity.
 */
