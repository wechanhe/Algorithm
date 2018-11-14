public class SelectionSort<T extends Comparable> {
    public T[] selectioinSort(T[] arr){
        for (int i=0;i<arr.length;i++){
            int min_idx = findSmallest(arr,i);
            T tmp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

    public int findSmallest(T[] arr,int begin){
        T min = arr[begin];
        int idx = begin;
        for (int i=begin;i<arr.length;i++) {
            if (arr[i].compareTo(min)<0) {
                min = arr[i];
                idx = i;
            }
        }
        return idx;
    }
}
