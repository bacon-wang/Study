import java.lang.reflect.Array;
import java.util.Arrays;

public class Example {
    // 数组逆序
    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void main() {
        int[] arr = {1, 2, 3, 4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // 冒泡排序
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) { // [1, len-1]：比的是相邻，所以 j 从 1 开始；每次循环，成功排序 i 个到末尾
                 if (arr[j - 1] > arr[j]) {
                     int temp = arr[j - 1];
                     arr[j - 1] = arr[j];
                     arr[j] = temp;
                 }
            }
        }
    }

    static void main4() {
        int[] arr = {9, 5, 2, 7, 10, 4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // 二分查找
    static int binarySearch(int[] arr, int toFind) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
           int mid = (left + right) / 2;
           if (toFind < arr[mid]) {
               right = mid - 1; // 去左边找
           } else if (toFind > arr[mid]) {
                left = mid + 1; // 去右边找
           } else {
               return mid;
           }
        }
        return -1;
    }

    static void main3() {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int toFind = 4;
        System.out.println(toFind + " at arr[" + binarySearch(arr, toFind) + "]");
    }

    // 自己实现拷贝
    public static int[] copyOf(int[] arr) {
        int[] ret = new int[arr.length]; // 开辟一块新空间
        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i];
        }
        return ret;
    }

    // 数组拷贝
    static void main2() {
        // 数组是引用类型
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = arr; // 浅拷贝：和 arr 指向同一块堆空间
        newArr[0] = 10;
        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("newArr: " + Arrays.toString(newArr));

        // 使用 copyOf 创建新数组
        newArr = Arrays.copyOf(arr, arr.length); // 深拷贝：自己和 arr 拥有不同的堆空间，数据互相独立
        newArr[0] = 100;
        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("newArr: " + Arrays.toString(newArr));

        // 拷贝指定范围
        int[] newArr2 = Arrays.copyOfRange(arr, 2,4);
        System.out.println("newArr2: " + Arrays.toString(newArr2));

        // 使用自己的 copyOf
        int[] newArr3 = copyOf(newArr2);
        System.out.println("newArr3: " + Arrays.toString(newArr3));

    }

    // 数组转字符串
    static void main1() {
        int[] arr = {1, 2, 3, 4, 5};
        String newArr = Arrays.toString(arr);
        System.out.println(newArr);
    }
}
