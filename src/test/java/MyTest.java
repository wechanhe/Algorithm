import org.junit.Test;

public class MyTest {
    @Test
    public void test_BinarySearch(){
        Binarysearch binarysearch = new Binarysearch<Integer>();
        Integer[] numbers = {1,2,3,4,5,6,7,8};
        System.out.println(binarysearch.binarySearch(numbers, 0));
    }
}
