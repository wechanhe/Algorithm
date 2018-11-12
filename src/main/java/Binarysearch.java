public class Binarysearch<T extends Comparable> {
    public int binarySearch(T[] numbers, T target){
        int low = 0, high = numbers.length-1, mid;
        while (low <= high){
            mid = (high + low)/2;
            if (target.compareTo(numbers[mid]) == 0)
                return mid;
            else if (target.compareTo(numbers[mid]) < 0){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
