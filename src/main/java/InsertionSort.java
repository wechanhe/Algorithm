public class InsertionSort<T extends Comparable> {
    public T[] insertionSort(T[] numbers){
        for (int i=0;i < numbers.length-1;i++){
            int j = i+1;
            if (numbers[j].compareTo(numbers[i])<0) {
                T tmp = numbers[j];
                int k = i;
                // 查找应该插入的位置
                for (; k >= 0; k--)
                    if (numbers[k].compareTo(numbers[j]) < 0)
                        break;
                // 所有元素向后移动
                for (int l = j; l > k+1; l--) {
                    numbers[l] = numbers[l - 1];
                }
                numbers[k+1]=tmp;
            }
        }
        return numbers;
    }
}
