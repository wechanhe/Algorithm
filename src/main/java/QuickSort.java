public class QuickSort {
    public void quickSort(int[] arr, int low, int high){
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high){
        int pivot = low;
        while (low < high){
            while (arr[high] >= arr[pivot] && low < high)high--;
            while (arr[low] <= arr[pivot] && low < high)low++;
            swap(arr, low, high);
        }
        swap(arr, low, pivot);
        return low;
    }
    public void swap(int[] arr, int idx1, int idx2){
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
}
