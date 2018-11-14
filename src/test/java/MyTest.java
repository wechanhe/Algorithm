import org.junit.Test;

public class MyTest {
    @Test
    public void test_BinarySearch(){
        Binarysearch binarysearch = new Binarysearch<Integer>();
        Integer[] numbers = {1,2,3,4,5,6,7,8};
        System.out.println(binarysearch.binarySearch(numbers, 0));
    }

    @Test
    public void test_SelectionSort(){
        SelectionSort<Float> selectionSort = new SelectionSort<Float>();
        Float[] numbers = {2.0f,1.2f,4.4f,5.3f,7.1f,8.3f,4.7f,0.5f,9.1f,3.4f};
        numbers = selectionSort.selectionSort(numbers);
        for (int i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");
    }
}
