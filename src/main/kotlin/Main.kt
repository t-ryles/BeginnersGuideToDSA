fun main() {

    val unsortedList = mutableListOf(64, 34, 25, 12, 22, 11, 90)
    println("Unsorted list: $unsortedList")

    println("August 14, 2023")
    println("Bubble Sort:")
    val bubbleSortedList = BubbleSort().bubbleSort(unsortedList.toMutableList())
    println("Sorted list: $bubbleSortedList")

    println("August 15, 2023")
    println("Insertion Sort:")
    val insertionSortedList = InsertionSort().insertionSort(unsortedList)
    println("Sorted list: $insertionSortedList")

}