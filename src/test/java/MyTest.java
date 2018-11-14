import org.junit.Test;

public class MyTest {
    @Test
    public void test_BinarySearch(){
        Binarysearch binarysearch = new Binarysearch<Integer>();
        Integer[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binarysearch.binarySearch(arr, 0));
    }

    @Test
    public void test_InsertionSort(){
        InsertionSort<Float> insertionSort = new InsertionSort<Float>();
        Float[] arr = {2.0f,1.2f,4.4f,5.3f,7.1f,8.3f,4.7f,0.5f,9.1f,3.4f};
        arr = insertionSort.insertionSort(arr);
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    @Test
    public void test_SelectionSort(){
        SelectionSort<Float> selectionSort = new SelectionSort<Float>();
        Float[] arr = {2.0f,1.2f,4.4f,5.3f,7.1f,8.3f,4.7f,0.5f,9.1f,3.4f};
        arr = selectionSort.selectioinSort(arr);
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
