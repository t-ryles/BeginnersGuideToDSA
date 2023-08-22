class MergeSort {
    fun mergeSort(arr: List<Int>): List<Int> {
        //Base case
        if (arr.size <= 1) {
            return arr
        }

        //Dividing array into single element arrays
        val mid = arr.size / 2
        val leftHalf = arr.subList(0, mid)
        val rightHalf = arr.subList(mid, arr.size)

        //Recursive call
        val sortedLeft = mergeSort(leftHalf)
        val sortedRight = mergeSort(rightHalf)

        return merge(sortedLeft, sortedRight)
    }

    fun merge(left: List<Int>, right: List<Int>): List<Int> {
        var leftInd = 0
        var rightInd = 0

        //New array to store sorted arrays
        val mergedList = mutableListOf<Int>()

        while (leftInd < left.size && rightInd < right.size) {
            //Comparing values in both sub-arrays
            if (left[leftInd] <= right[rightInd]) {
                //If left is smaller add to mergedList
                mergedList.add(left[leftInd])
                leftInd++
            } else {
                //If right is smaller add to mergedList
                mergedList.add(right[rightInd])
                rightInd++
            }
        }

        //Whatever is left over in either list add to mergedList
        mergedList.addAll(left.subList(leftInd, left.size))
        mergedList.addAll(right.subList(rightInd, right.size))

        return mergedList
    }
}

/**
 * Notes:
 * This one function in broken up into TWO functions: sort and merge
 * Sort: breaks down the parent array into sub-arrays of each element.
 *      -uses a recursion to break the parent array into sub-arrays.
 * Merge: Compares and adds the lowest element in the new array [mergedList]
 *
 * For uneven arrays, the last lines adds the remaining elements to the mergedList array.
 */

