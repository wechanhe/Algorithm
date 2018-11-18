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

    @Test
    public void test_DivideAndConquer(){
        DivideAndConquer dv = new DivideAndConquer();
        int[] arr = {1,2,3,10,5,6,7,8,9};
        System.out.println("sum of arr:"+dv.sum(arr,0));
        System.out.println("max of arr:"+dv.maxNum(arr, 0, arr.length-1));
    }

    @Test
    public void test_QuickSort(){
        QuickSort quickSort = new QuickSort();
        int[] arr = {2,5,6,8,1,3,0,6,4,2,3};
        quickSort.quickSort(arr, 0 , arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
