import junit.framework.TestCase
import org.junit.Test
class MergeSortTest {

    @Test
    fun mergeSortTest1(){
        val unsortedList = mutableListOf(64, 34, 25, 12, 22, 11, 90)
        val sortedList = MergeSort().mergeSort(unsortedList.toMutableList())

        val expectedList = listOf(11, 12, 22, 25, 34, 64, 90)
        TestCase.assertEquals(expectedList, sortedList)
    }

    @Test
    fun mergeSortTest2(){
        val unsortedList = mutableListOf(23)
        val sortedList = MergeSort().mergeSort(unsortedList.toMutableList())

        val expectedList = listOf(23)
        TestCase.assertEquals(expectedList, sortedList)
    }
}