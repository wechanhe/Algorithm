public class InsertionSort<T extends Comparable> {
    public T[] insertionSort(T[] arr){
        for (int i=0;i < arr.length-1;i++){
            int j = i+1;
            if (arr[j].compareTo(arr[i])<0) {
                T tmp = arr[j];
                int k = i;
                // 查找应该插入的位置
                for (; k >= 0; k--)
                    if (arr[k].compareTo(arr[j]) < 0)
                        break;
                // 所有元素向后移动
                for (int l = j; l > k+1; l--) {
                    arr[l] = arr[l - 1];
                }
                arr[k+1]=tmp;
            }
        }
        return arr;
    }
}
