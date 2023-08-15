fun main() {
    println("August 14, 2023")
    println("Bubble Sort:")

    val unsortedList = mutableListOf(64, 34, 25, 12, 22, 11, 90)
    val sortedList = BubbleSort().bubbleSort(unsortedList.toMutableList())
    println("Unsorted list: $unsortedList")
    println("Sorted list: $sortedList")

    println("Insertion Sort:")

}