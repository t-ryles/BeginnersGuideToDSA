import junit.framework.TestCase
import org.junit.Test

class InsertionSortTest{
    @Test
    fun test1InsertionSort(){
        val unsortedList = mutableListOf(64, 34, 25, 12, 22, 11, 90)
        val sortedList = BubbleSort().bubbleSort(unsortedList.toMutableList())

        val expectedList = listOf(11, 12, 22, 25, 34, 64, 90)
        TestCase.assertEquals(expectedList, sortedList)
    }

    @Test
    fun test2InsertionSort(){
        val unsortedList = mutableListOf(5, 2, 9, 1, 5, 6)
        val sortedList = BubbleSort().bubbleSort(unsortedList.toMutableList())

        val expectedList = listOf(1,2,5,5,6,9)
        TestCase.assertEquals(expectedList, sortedList)
    }

    @Test
    fun test3InsertionSort(){
        val unsortedList = mutableListOf(12, 45, 23, 7, 3, 56, 8, 2)
        val sortedList = BubbleSort().bubbleSort(unsortedList.toMutableList())

        val expectedList = listOf(2,3,7,8,12,23,45,56)
        TestCase.assertEquals(expectedList, sortedList)
    }
}