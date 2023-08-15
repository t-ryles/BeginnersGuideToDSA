import junit.framework.TestCase.assertEquals
import org.junit.Test

class BubbleSortTest {
    @Test
    fun testBubbleSort(){
        val unsortedList = mutableListOf(64, 34, 25, 12, 22, 11, 90)
        val sortedList = BubbleSort().bubbleSort(unsortedList.toMutableList())

        val expectedList = listOf(11, 12, 22, 25, 34, 64, 90)
        assertEquals(expectedList, sortedList)
    }
}