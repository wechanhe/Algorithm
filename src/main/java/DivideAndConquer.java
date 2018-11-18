public class DivideAndConquer {
    /**
     * 递归求和
     * @param arr
     * @param index
     * @return
     */
    public int sum(int[] arr, int index){
        if (index == arr.length)
            return 0;
        else if (index == arr.length-1)
            return arr[index];
        else
            return arr[index] + sum(arr, index+1);
    }

    /**
     * 分治法求最大值
     * @param arr
     * @param begin
     * @param end
     * @return
     */
    public int maxNum(int[] arr, int begin, int end){
        if (begin == end)
            return arr[begin];
        else if (begin > end)
            return 0;
        int mid = (begin + end)/2;
        int lefMax = maxNum(arr, begin, mid);
        int rightMax = maxNum(arr, mid+1, end);
        return Math.max(lefMax, rightMax);
    }
}
