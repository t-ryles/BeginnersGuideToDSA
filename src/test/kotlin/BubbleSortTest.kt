import junit.framework.TestCase.assertEquals
import org.junit.Test

class BubbleSortTest {
    @Test
    fun test1BubbleSort(){
        val unsortedList = mutableListOf(64, 34, 25, 12, 22, 11, 90)
        val sortedList = BubbleSort().bubbleSort(unsortedList.toMutableList())

        val expectedList = listOf(11, 12, 22, 25, 34, 64, 90)
        assertEquals(expectedList, sortedList)
    }

    @Test
    fun test2BubbleSort(){
        val unsortedList = mutableListOf(5, 2, 9, 1, 5, 6)
        val sortedList = BubbleSort().bubbleSort(unsortedList.toMutableList())

        val expectedList = listOf(1,2,5,5,6,9)
        assertEquals(expectedList, sortedList)
    }

    @Test
    fun test3BubbleSort(){
        val unsortedList = mutableListOf(12, 45, 23, 7, 3, 56, 8, 2)
        val sortedList = BubbleSort().bubbleSort(unsortedList.toMutableList())

        val expectedList = listOf(2,3,7,8,12,23,45,56)
        assertEquals(expectedList, sortedList)
    }
}